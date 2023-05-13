package StringseExercicios;
import java.util.Scanner;

public class exercicio3 {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 int num1;
	 int algarismodezena;
	 int calculo;

	 
	 System.out.println("Insira um número que possua três digitos (100 a 999): ");
	 num1 = input.nextInt();
	 
	 algarismodezena = num1/10;
	 System.out.println("Dividindo por dez, temos o número inserido como: " + algarismodezena);
	 
	 calculo = algarismodezena%10;
	 System.out.println("Logo, O algarismo da casa das dezenas do número inserido é : " + calculo);
	    input.close();
}
}
