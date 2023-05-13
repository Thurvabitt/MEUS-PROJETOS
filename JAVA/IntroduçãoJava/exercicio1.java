package IntroduçãoJava;
import java.util.Scanner;

public class exercicio1 {
public static void main(String[] args) {
	int num1, num2;
    Scanner input = new Scanner(System.in);

	
	System.out.println("Informe o primeiro número:");
	num1 = input.nextInt();
	
	System.out.println("Informe o segundo número: ");
	num2 = input.nextInt();
	
	System.out.println("A soma dos números é: " + (num1 + num2));
	System.out.println("A Subtração dos números é: " + (num1 - num2));
	System.out.println("A Multiplicação dos números é: " + (num1 * num2));
	System.out.println();
	
    input.close();
}

}

