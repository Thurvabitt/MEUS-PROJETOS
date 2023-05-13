package TrabalhoFaculdadeExercicios;

public class OperacoesMatematicas {

    // método para calcular o fatorial de um número
    public static int fatorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado = i;
        }
        return resultado;
    }

    // método para calcular a exponenciação de um número
    public static int exponencial(int x, int y) {
        int resultado = 1;
        for (int i = 1; i <= y; i++) {
            resultado= x;
        }
        return resultado;
    }

    // método para encontrar o maior número em um vetor
    public static int maior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }
}
