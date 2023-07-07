package supermercado2;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularValorTotal() {
        return produto.getPreco() * quantidade;
    }

    public double calcularValorImposto() {
        return calcularValorTotal() * produto.getAliquotaImposto();
    }
}