package clearminds.cuentas.test;

import clearminds.cuentas.Cuentas;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuentas cuenta1 = new Cuentas("03476");
		cuenta1.setSaldo(675);
		Cuentas cuenta2 = new Cuentas("03476","C",98);
		Cuentas cuenta3 = new Cuentas("03476");
		cuenta3.setTipo("C");
		System.out.println("--------Valores Iniciales--------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("--------Valores Modificados--------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		Cuentas cuenta4 = new Cuentas("0987");
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10);
		Cuentas cuenta5 = new Cuentas("0557","C",10);
		Cuentas cuenta6 = new Cuentas("0666");
		System.out.println("--------Valores Nuevos--------");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	}

}
