package StringseExercicios;
import java.util.Scanner;

public class exerciciosString1 {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String palavra;
	String letra;
	
	 System.out.println("Digite uma palavra ");
	 palavra = input.next();
	 
	 System.out.println("Digite uma letra: ");
	 letra = input.next();
	
	
	System.out.println(palavra.contains(letra));
	
    input.close();
}
}
