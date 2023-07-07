package pluviometros;

public abstract class Caminhao {
    protected int capacidadeMaxima;

    public Caminhao(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public abstract void inserePluviometro(Pluviometro pluviometro);
}