package Try_e_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	private int x;
	private int y;
	
	public Calculadora() {
		
	}
	
	public Calculadora(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int soma() {
		return x + y;
	}
	
	public int subtracao() {
		return x - y;
	}
	
	public int multiplicacao() {
		return x * y;
	}
	
	public int divisao() {
		boolean achou = false;
		int resultado = 0;
		Scanner in = new Scanner(System.in);
		while(!achou) {
			try {
				resultado = x / y;
				achou = true;
			}
			catch(ArithmeticException e) {
				System.out.println("Erro de divisão por zero! " 
						+ e.getMessage());
				System.out.println("Informe novamente o segundo número:");
				y = in.nextInt();
			}
		}in.close();
		return resultado;
	}
	
	public int divisao2() {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Informe o primeiro número:");
			x = in.nextInt();
			System.out.println("Informe o segundo número:");
			y = in.nextInt();
			in.close();
			return x / y;
		}
		catch(Exception e) {
			System.out.println("Exceção capturada! " + e.toString());
		}
		finally {
			System.out.println("Execução finalizada com "
					+ "ou sem lançamento de exceção");
		}
//		catch(ArithmeticException a) {
//			System.out.println("Erro de divisão por zero! " +
//								a.getMessage());
//		}
//		catch(InputMismatchException i) {
//			System.out.println("Erro de entrada de dados! " +
//							  i.toString());
//		}
		return -1;
	}
}
