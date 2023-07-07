package supermercado2;

public class Produto {
    private String nome;
    private double preco;
    private double estoque;
    private double aliquotaImposto;

    public Produto(String nome, double preco, double estoque, double aliquotaImposto) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.aliquotaImposto = aliquotaImposto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getEstoque() {
        return estoque;
    }

    public double getAliquotaImposto() {
        return aliquotaImposto;
    }
}