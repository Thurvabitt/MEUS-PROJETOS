package StringseExercicios;
import java.util.Scanner;

public class exercicio2 {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double distancia;
	double tempo;
	double vm;
	
	System.out.println("Informe a distância percorrida: ");
	distancia = input.nextDouble();
	
	System.out.println("Informe o tempo gasto: ");
	tempo = input.nextDouble();
	
	vm = distancia/tempo;
			
	System.out.println("A velocidade média é: " + vm);
	System.out.printf("A velocidade média é: %.2f", vm);
    input.close();
}
}
