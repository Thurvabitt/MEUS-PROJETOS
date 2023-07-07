package empréstimo2;

import java.time.LocalDate;

public class Emprestimo {
    private Pessoa pessoa;
    private Ferramenta ferramenta;
    private LocalDate dataEmprestimo;

    public Emprestimo(Pessoa pessoa, Ferramenta ferramenta) {
        this.pessoa = pessoa;
        this.ferramenta = ferramenta;
        this.dataEmprestimo = LocalDate.now();
        ferramenta.setEmprestada(true);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }
}