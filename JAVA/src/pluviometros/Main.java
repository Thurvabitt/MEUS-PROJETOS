package pluviometros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo do pluviômetro (Exemplo de pluviômetros: Convencionais, Semiautomáticos e automáticos):");
        String tipoPluviometro = scanner.nextLine();
        Pluviometro pluviometro = new Pluviometro(tipoPluviometro);

        System.out.println("Informe a capacidade em toneladas do caminhão Alfa (máx 5 toneladas):");
        double capacidadeAlfa = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        while (capacidadeAlfa > 5) {
            System.out.println("Digite novamente. O limite de toneladas é 5:");
            capacidadeAlfa = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer
        }

        System.out.println("Informe a capacidade do caminhão Beta:");
        int capacidadeBeta = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        CaminhaoAlfa caminhaoAlfa = new CaminhaoAlfa();
        caminhaoAlfa.inserePluviometro(pluviometro);

        CaminhaoBeta caminhaoBeta = new CaminhaoBeta();
        caminhaoBeta.inserePluviometro(pluviometro);
    }
}