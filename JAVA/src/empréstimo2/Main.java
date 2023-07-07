package empréstimo2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa:");
        String nomePessoa1 = scanner.nextLine();
        Pessoa pessoa1 = new Pessoa(nomePessoa1);

        System.out.println("Digite o nome da segunda pessoa:");
        String nomePessoa2 = scanner.nextLine();
        Pessoa pessoa2 = new Pessoa(nomePessoa2);

        System.out.println("Digite o nome da primeira ferramenta:");
        String nomeFerramenta1 = scanner.nextLine();
        Ferramenta ferramenta1 = new Ferramenta(nomeFerramenta1);

        System.out.println("Digite o nome da segunda ferramenta:");
        String nomeFerramenta2 = scanner.nextLine();
        Ferramenta ferramenta2 = new Ferramenta(nomeFerramenta2);

        Emprestimo emprestimo1 = new Emprestimo(pessoa1, ferramenta1);
        Emprestimo emprestimo2 = new Emprestimo(pessoa2, ferramenta2);

        System.out.println("Empréstimo 1:");
        System.out.println("Pessoa: " + emprestimo1.getPessoa().getNome());
        System.out.println("Ferramenta: " + emprestimo1.getFerramenta().getNome());
        System.out.println("Data de empréstimo: " + emprestimo1.getDataEmprestimo());
        System.out.println();

        System.out.println("Empréstimo 2:");
        System.out.println("Pessoa: " + emprestimo2.getPessoa().getNome());
        System.out.println("Ferramenta: " + emprestimo2.getFerramenta().getNome());
        System.out.println("Data de empréstimo: " + emprestimo2.getDataEmprestimo());
        System.out.println();

        scanner.close();
    }
}