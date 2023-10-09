package aula;

public class ContaEspecial extends Conta {
	private double limite;
	
	public ContaEspecial( int n, double s, double li) {
		super(n,s);
		limite = li;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void exibe() {
		System.out.println("----------------------");
		System.out.println("     CONTA ESPECIAL   ");
		System.out.println("----------------------");
		System.out.println("Num.  : " + getNum());
		System.out.println("Saldo : " + getSaldo() );
		System.out.println("Limite: " + limite );
		System.out.println("----------------------");	
	}
	
	public void debito(double valor) {
		if ( valor <= saldo+limite  ) {
			saldo = saldo - valor;
		}
		else
			System.out.println("Valor acima do saldo+limite!");
	}
}
