package agenda2;

import java.util.List;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private List<String> telefones;
    private String email;
    private Endereco endereco;

    public Contato(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
        this.telefones.add(telefone);
        this.email = email;
        this.endereco = endereco;
    }

    public void adicionarTelefone(String telefone) {
        telefones.add(telefone);
    }

    public String getNome() {
        return nome;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}