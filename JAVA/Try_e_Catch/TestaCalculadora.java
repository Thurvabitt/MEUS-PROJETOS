package Try_e_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaCalculadora {
	public static void main(String [] args) {
//		Scanner in = new Scanner(System.in);
//		int num1, num2;
//		try {
//			System.out.println("Informe o primeiro número:");
//			num1 = in.nextInt();
//			System.out.println("Informe o segundo número:");
//			num2 = in.nextInt();
//			Calculadora calc = new Calculadora(num1, num2);
//			System.out.println("Divisão dos números: " + calc.divisao());
//			System.out.println("Soma dos números: " + calc.soma());
//			System.out.println("Subtração dos números: " + calc.subtracao());
//			System.out.println("Multiplicação dos números: " + calc.multiplicacao());
//		}
//		catch(InputMismatchException i) {
//			System.out.println("Erro: " + i.toString());
//			System.out.println("Mensagem: " + i.getMessage());
//		}
		Calculadora calc = new Calculadora();
		System.out.println("Divisão:" + calc.divisao2());
	}
}
