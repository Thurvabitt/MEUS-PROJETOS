package Condicionais;

import java.util.Scanner;

public class Divisiveis {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int num;
	
	System.out.println("Informe um número: ");
	num = input.nextInt();
	
	if ((num % 2 == 0) && (num % 5 == 0 )){
		System.out.println("O número é divisível por 2 e 5");
	}
	else {
		System.out.println("O número inserido não é divisível por 2 e 5");
		
	    input.close();
	}
 }
}
