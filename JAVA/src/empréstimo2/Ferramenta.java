package empréstimo2;

public class Ferramenta {
    private String nome;
    private boolean emprestada;

    public Ferramenta(String nome) {
        this.nome = nome;
        this.emprestada = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEmprestada() {
        return emprestada;
    }

    public void setEmprestada(boolean emprestada) {
        this.emprestada = emprestada;
    }
}