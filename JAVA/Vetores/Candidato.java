package Vetores;

import java.util.Arrays;

public class Candidato {
    private String Nome;
    private String Cpf;
    private char[] Respostas;

    public Candidato() {

    }

    public Candidato(String nome, String cpf, char[] respostas) {
        this.Nome = nome;
        this.Cpf = cpf;
        this.Respostas = respostas;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public char[] getRespostas() {
        return Respostas;
    }

    public void setRespostas(char[] respostas) {
        Respostas = respostas;
    }

    @Override
    public String toString() {
        return "Candidato [Nome=" + Nome + ", Cpf=" + Cpf + ", Respostas=" + Arrays.toString(Respostas) + "]";
    }

    public int corrigirProva(char[] gabarito) {
        int acertos = 0;
        for (int i = 0; i < Respostas.length && i < gabarito.length; i++) {
            if (Respostas[i] == gabarito[i]) {
                acertos++;
            }
        }
        return acertos;
    }
}
