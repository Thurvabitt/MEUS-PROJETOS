package CriandoMain;

import java.util.Scanner;

public class Ex2MainRetangulo {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Ex2retangulo retangulo = new Ex2retangulo();
		
		System.out.println("Digite o lado 1: ");
		int lado1 = input.nextInt();
		
		System.out.println("Digite o lado 2: ");
		int lado2 = input.nextInt();
		
		retangulo.setlado1(lado1);
		retangulo.setlado2(lado2);
		
		
		System.out.println("Lado 1: " + retangulo.getlado1());
		System.out.println("Lado 2: " + retangulo.getlado2());
		
		System.out.println("Área do retângulo: " + retangulo.calculaArea());
		System.out.println("Perímetro do retângulo: " + retangulo.calculaPerimetro());
		
	    input.close();
	    }
	}
	

