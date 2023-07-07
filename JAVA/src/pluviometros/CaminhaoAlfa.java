package pluviometros;

public class CaminhaoAlfa extends Caminhao {
    public CaminhaoAlfa() {
        super(5); // Capacidade máxima do caminhão Alfa em toneladas (fixa em 5 toneladas)
    }

    @Override
    public void inserePluviometro(Pluviometro pluviometro) {
        double pesoPluviometro = pluviometro.getPeso();
        double capacidadeMaximaKg = capacidadeMaxima * 1000; // Convertendo toneladas para quilogramas
        if (pesoPluviometro <= capacidadeMaximaKg) {
            System.out.println("Pluviômetro inserido no caminhão Alfa.");
        } else {
            System.out.println("O pluviômetro é muito pesado para o caminhão Alfa.");
        }
    }
}