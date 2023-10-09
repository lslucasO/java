package aula;

public class Conta {
	private int num;
	protected double saldo;

	public Conta(int num, double saldo) {
		super();
		this.num = num;
		this.saldo = saldo;
	}
	public int getNum() {
		return num;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void debito(double valor) {
		// Alterar para limitar pelo saldo.
		if ( valor <= saldo  ) {
			saldo = saldo - valor;
		}
		else
			System.out.println("Valor acima do saldo!");
	}
	
	public void credito(double valor) {
		saldo = saldo + valor;
	}
	
	public void exibe() {
		System.out.println("---------------");
		System.out.println("     CONTA   ");
		System.out.println("---------------");
		System.out.println("Num. : " + num);
		System.out.println("Saldo: " + saldo);
		System.out.println("---------------");
		
		
	}
} 
