package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<String> ListaNomes = new ArrayList<String>();
		String nome;
		boolean achou = false;

		System.out.println("Digite os nomes(digite 'fim' para encerrar): ");
		nome = input.nextLine();

		while (!nome.equalsIgnoreCase("fim")) {
			ListaNomes.add(nome);
			System.out.println("Informe um nome: ");
			nome = input.nextLine();
		}

		System.out.println("Informe um nome a ser buscado: ");
		nome = input.nextLine();

		for (int i = 0; i < ListaNomes.size(); i++) {
			if (ListaNomes.get(i).equalsIgnoreCase(nome)) {
				System.out.println("O nome " + nome + " está no ArrayList na posição " + i);
				achou = true;
			}
		}

		if (!achou) {
			System.out.println("O nome " + nome + " não foi encontrado no ArrayList.");
		}
        input.close();
	}
}
