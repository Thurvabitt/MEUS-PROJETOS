package IntroduçãoAoThrow_e_Exercicios;
import java.util.Scanner;

public class Conta {
	private double saldo;
	
	public Conta() {
		
	}
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	public double depositar(double valor) {
		saldo += valor;
		
		return saldo;
	}

	
	public double sacar(double valor) {
	try {
		if(saldo < valor) {
			throw new ExcecaoConta(saldo);
		}else {
			saldo -= saldo;
		}
	}
	catch(ExcecaoConta c){
		
	}
		return saldo;
	}
}
