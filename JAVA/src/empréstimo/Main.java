package empréstimo;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João");
        Pessoa pessoa2 = new Pessoa("Maria");

        Ferramenta ferramenta1 = new Ferramenta("Martelo");
        Ferramenta ferramenta2 = new Ferramenta("Chave de fenda");

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
    }
}