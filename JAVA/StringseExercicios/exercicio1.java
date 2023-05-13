package StringseExercicios;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int resultado;

		System.out.println("Insira o primeiro número: ");
		num1 = input.nextInt();

		System.out.println("Insira o segundo número: ");
		num2 = input.nextInt();

		resultado = num1 + num2;
		System.out.println("A soma dos números é: " + resultado);

		resultado = num1 - num2;
		System.out.println("A subtração é: " + resultado);

		resultado = num1 * num2;
		System.out.println("A multiplicação dos números é: " + resultado);

		resultado = num1 / num2;
		System.out.println("A divisão dos números é: " + resultado);

		resultado = num1 % num2;
		System.out.println("O resto da divisão dos números é: " + resultado);
		input.close();
	}
}
