package Try_e_Catch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_imc_usandoTryCatch {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double peso, altura;
		
		try {
			System.out.println("Informe o peso: ");
			peso = in.nextDouble();
			
			System.out.println("Informe a altura:");
			altura = in.nextDouble();
			
			if(altura == 0) {
				throw new ArithmeticException();
			}else {
				System.out.println("Imc: " + (peso/altura*altura));
			}
			
		}
		
		catch(InputMismatchException e) {
			System.out.println("Erro em um dos valores informados!");
			System.out.println(e.toString());
		}
		
		catch(ArithmeticException e) {
			System.out.println("Erro de divisão por zero!");
		} in.close();
	}
}
