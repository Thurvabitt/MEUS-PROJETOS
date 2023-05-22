package IntroduçãoAoThrow_e_Exercicios;

import java.util.Scanner;

public class TestaParImpar {
	public static void main(String[] args) {
		ParImpar p = new ParImpar();
		
		Scanner in = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe o número: ");
		numero = in.nextInt();
		
		p.setNumero(numero);
		p.verificaParImpar();
		
		System.out.println("Informe outro número: ");
		numero = in.nextInt();
		p.setNumero(numero);
		try {
			p.verificaParImpar2();
		}catch(ExcecaoParImpar e){
			System.out.println(e.toString());
		}in.close();
		
	}
}
