package Condicionais;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int dia;
	System.out.println("Informe o dia da semana: ");
	dia = input.nextInt();
	
	switch (dia) {
	case 1: {
		System.out.println("Segunda-feira");
		break;
	}
	case 2:{
		System.out.println("Terça-feira");
		break;
	}
	case 3:{
		System.out.println("Quarta-feira");
		break;
	}
	case 4:{
		System.out.println("Quinta-feira");
		break;
	}
	case 5:{
		System.out.println("Sexta-feira");
		break;
	}
	case 6:{
		System.out.println("Sábado");
		break;
	}
	case 7:{
		System.out.println("Domingo");
		break;
	}
	default:{
		System.out.println("Número inválido!");
	}
    input.close();
  }
 }
}
