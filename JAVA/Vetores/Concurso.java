package Vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class Concurso {
    private char[] gabarito;
    private ArrayList<Candidato> Candidatos;

    public Concurso() {
        gabarito = new char[10];
        Candidatos = new ArrayList<Candidato>();
    }

    private boolean CpfExistir(String Cpf) {
        for(Candidato candidato: Candidatos) {
            if (candidato.getCpf().equals(Cpf)){
                return true;
            }
        }
        return false;
    }

    public void adicionarCandidato(Candidato candidato) {
        if(!CpfExistir(candidato.getCpf())) {
            Candidatos.add(candidato);
        }
        else {
            System.out.println("O CPF já está registrado no concurso!");
        }
    }

    public void removerCandidato(String cpf) {
        for(Candidato candidato: Candidatos) {
            if(candidato.getCpf().equals(cpf)) {
                Candidatos.remove(candidato);
                return;
            }
        }
        System.out.println("Não foi encontrado um candidato com esse CPF no concurso.");
    }

    public void adicionarRespostasAoGabarito() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as respostas para as questões:");

        for(int i = 0; i < gabarito.length; i++) {
            char resposta = ' ';
            while (resposta != 'a' && resposta != 'b' && resposta != 'c' && resposta != 'd' && resposta != 'e') {
                System.out.println("Questão " + (i + 1) + ": ");
                resposta = scanner.nextLine().charAt(0);
            }
            gabarito[i] = resposta;
        }
    }

    public void corrigirProvas() {
        for (Candidato candidato: Candidatos) {
            int acertos = candidato.corrigirProva(gabarito);
            System.out.println("Nome do candidato: " + candidato.getNome() + ", CPF: " + candidato.getCpf() + ", Acertos: " + acertos);
        }
    }

    public void imprimirCandidatos() {
        for(Candidato candidato: Candidatos) {
            int acertos = candidato.corrigirProva(gabarito);
            System.out.println("Nome: " + candidato.getNome() + ", CPF: " + candidato.getCpf() + ", Acertos: " + acertos);
        }
    }
}