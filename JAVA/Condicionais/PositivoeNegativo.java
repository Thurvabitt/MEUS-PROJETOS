package Condicionais;

import java.util.Scanner;

public class PositivoeNegativo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.println("Informe um número: ");
		num = input.nextInt();
		if (num > 0) {
			System.out.println("O número é positivo!");
		}
		else {
			System.out.println("O número é negativo!");
			
		    input.close();
		}
	}
}
