package clearminds.cuentas;

public class Cuentas {
	private String id;
	private String tipo;
	private double saldo;
	
	public Cuentas(String id) {
		this.id = id;
		this.tipo = "A";
	}
	
	public Cuentas(String id, String tipo, double saldo) {
		this.id=id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
	public String getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void imprimir() {
		System.out.println("********************");
		System.out.println("\n CUENTA \n");
		System.out.println("********************");
		System.out.println("\n Número de Cuenta: "+ id);
		System.out.println("\n Tipo: " + tipo);
		System.out.println("\n Saldo: USD " + saldo);
		System.out.println("\n********************");
	}
	
	public void imprimirConMiEstilo() {
		System.out.println("¬°¬°¬°¬°¬°¬°¬°¬°¬°¬°¬°¬°¬");
		System.out.println("\n CUENTA \n");
		System.out.println("¬°¬°¬°¬°¬°¬°¬°¬°¬°¬°¬°¬°¬");
		System.out.println("\n Número de Cuenta: "+ id);
		System.out.println("\n Tipo: " + tipo);
		System.out.println("\n Saldo: USD " + saldo);
		System.out.println("\n¬°¬°¬°¬°¬°¬°¬°¬°¬°¬°¬°¬°¬");
	}
	
}
