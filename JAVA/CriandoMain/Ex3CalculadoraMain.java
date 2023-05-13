package CriandoMain;

import java.util.Scanner;

public class Ex3CalculadoraMain {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		Ex3PseudoCalculadora calculadora = new Ex3PseudoCalculadora();
		
		int num1;
		int num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = input.nextInt();
		calculadora.setX(num1);
		
		System.out.println("Digito o segundo número: ");
		num2 = input.nextInt();
		calculadora.setY(num2);
		
		System.out.println("Soma: " + calculadora.soma());
		System.out.println("Subtração: "+ calculadora.subtracao());
		System.out.println("Multiplicação: "+ calculadora.multiplicacao());
		System.out.println("Divisão: "+ calculadora.divisao());	
	    input.close();}
	}
	

