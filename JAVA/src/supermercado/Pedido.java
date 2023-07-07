package supermercado;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (ItemPedido item : itens) {
            valorTotal += item.calcularValorTotal();
        }
        return valorTotal;
    }

    public double calcularValorImposto() {
        double valorImposto = 0.0;
        for (ItemPedido item : itens) {
            valorImposto += item.calcularValorImposto();
        }
        return valorImposto;
    }
}
