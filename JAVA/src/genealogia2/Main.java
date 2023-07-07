package genealogia2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do pai:");
        String nomePai = scanner.nextLine();
        System.out.println("Digite a idade do pai:");
        int idadePai = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite o nome da mãe:");
        String nomeMae = scanner.nextLine();
        System.out.println("Digite a idade da mãe:");
        int idadeMae = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite o nome do filho(a):");
        String nomeFilho = scanner.nextLine();
        System.out.println("Digite a idade do filho(a):");
        int idadeFilho = scanner.nextInt();

        Pessoa pai = new Pessoa(nomePai, idadePai);
        Pessoa mae = new Pessoa(nomeMae, idadeMae);
        Pessoa filho = new Pessoa(nomeFilho, idadeFilho, pai, mae);

        System.out.println("Filho(a): " + filho.getNome());
        System.out.println("Idade: " + filho.getIdade());
        System.out.println("Pai: " + filho.getPai().getNome());
        System.out.println("Mãe: " + filho.getMae().getNome());

        scanner.close();
    }
}
