package IntroduçãoAoThrow_e_Exercicios;

public class ExcecaoConta extends Exception{
	private double saldo;
	
	public ExcecaoConta() {
		
	}
	
	public ExcecaoConta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public String toString() {
		return "O valor do saldo é insuficiente para o saque" + "\n saldo: R$ " + saldo;
	}
}
