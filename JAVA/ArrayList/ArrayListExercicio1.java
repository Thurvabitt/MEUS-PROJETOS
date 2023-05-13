package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int i;

        System.out.println("Digite os números (digite -1 para terminar): ");

        i = input.nextInt();
        while (i != -1) {
            if (!numeros.contains(i)) {
                numeros.add(i);
            } else {
                System.out.println("Número repetido: " + i);
            }
            i = input.nextInt();
        }

        Collections.sort(numeros);
        System.out.println(numeros);

        input.close();
    }
}
