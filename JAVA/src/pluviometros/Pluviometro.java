package pluviometros;

public class Pluviometro {
    protected String tipo;

    public Pluviometro(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPeso() {
        // Implementação do cálculo do peso baseado no tipo do pluviômetro
        // Exemplo: Supondo que o peso seja 100 para qualquer tipo
        return 100;
    }

    public int getCapacidade() {
        // Implementação do cálculo da capacidade baseado no tipo do pluviômetro
        // Exemplo: Supondo que a capacidade seja 500 para qualquer tipo
        return 500;
    }
}
