package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.entidades.Utilitario;

public class CalculadoraAmortizacion {
	
	
	public static double calcularCuota(Prestamo pres) {
		double p = pres.getMonto();
		double tasaAnual = pres.getInteres();
		int n = pres.getPlazo();
		//convertir el porcentaje a decimal
		double tasa = tasaAnual / 100;
		//calcular la tasa de interes
		double i= tasa/ 12.0;
		//calcular la amortizacion mediante la explicacion brindada
		//numerador
		double numArriba = p * i;
		//denominador
		double denomAbajo = 1 - Math.pow(1+i, -n);
		
		double cuota = numArriba / denomAbajo;
		
		return cuota;
	}
	
	public static void calcularValoresCuota(double interesPres, Cuota cuotaAct, Cuota cuotaSig) {
		double interesPgd = cuotaAct.getInicio() * interesPres;
		double capitalAmortizado = cuotaAct.getCuota() - interesPgd;
		double saldoFin = cuotaAct.getInicio() - capitalAmortizado;
		
		cuotaAct.setInteres(interesPgd); 
        cuotaAct.setAbonoCapital(capitalAmortizado); 
        cuotaAct.setSaldo(saldoFin);
        if (cuotaSig != null) {
            cuotaSig.setInicio(cuotaAct.getSaldo()); 
        }
	}
	
	public static void generarTabla(Prestamo prestamo) {
		//el tamaño depende de los plazos
		//la cuota es fija, siempre el mismo valor
		//
		int n = prestamo.getPlazo();
        Cuota[] cuotas = prestamo.getCuotas();

        // 1 Calcular cuota mensual y tasa del periodo
        double cuotaMensual = calcularCuota(prestamo);
        double tasaPeriodo = prestamo.getInteres() / 12.0 / 100.0;

        // 2 Inicializar las cuotas (n posiciones)
        for (int i = 0; i < n; i++) {
            cuotas[i] = new Cuota(i + 1);
            cuotas[i].setCuota(cuotaMensual);
        }

        // 3 Valor primera cuota: 
        cuotas[0].setInicio(prestamo.getMonto());

        // 4 y 5) Calcular los valores de cada cuota
        for (int i = 0; i < n; i++) {
            Cuota actual = cuotas[i];
            Cuota siguiente = (i < n - 1) ? cuotas[i + 1] : null;
            calcularValoresCuota(tasaPeriodo, actual, siguiente);
        }

        // 6 Forma de ajustar la ultima cuota intercalando la funcion redondear: 
        Cuota ultimaCuota = cuotas[n - 1];

        double saldoPendiente = ultimaCuota.getSaldo();
        double saldoRedondeado = Utilitario.redondear(saldoPendiente);

        // Si después de redondear aproximadamnete a cero 0: 
        if (saldoRedondeado != 0) {

            double nuevoAbono = ultimaCuota.getAbonoCapital() + saldoRedondeado;
            nuevoAbono = Utilitario.redondear(nuevoAbono);

            ultimaCuota.setAbonoCapital(nuevoAbono);
            ultimaCuota.setCapital(nuevoAbono);

            double nuevaCuota = ultimaCuota.getCuota() + saldoRedondeado;
            nuevaCuota = Utilitario.redondear(nuevaCuota);

            ultimaCuota.setCuota(nuevaCuota);
            ultimaCuota.setSaldo(0);
        }
	}
	
	public static void mostrarTabla(Prestamo pres) {
		Cuota[] cuotas = pres.getCuotas();

        System.out.println("\n---------------------------------------------------------------------------------------------");
        System.out.println("                         TABLA DE AMORTIZACIÓN (SISTEMA FRANCÉS)");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(" Num. "+ "  Cuota  "+ "  Inicio "+ "  Interés "+ "  Abono Cap. "+ "  Saldo  ");
        
        System.out.println("---------------------------------------------------------------------------------------------");
        
        // Iterar sobre el arreglo 'cuotas' e imprimir cada fila
        for (int i = 0; i < cuotas.length; i++) {
            Cuota cuota = cuotas[i];
            if (cuota != null) {
                cuota.mostrarPrestamo();
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------");
	}
}
