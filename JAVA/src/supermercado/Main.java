package supermercado;

	public class Main {
	    public static void main(String[] args) {
	        Produto p1 = new Produto("Arroz", 5.99, 10, 0.05);
	        Produto p2 = new Produto("Feijão", 4.99, 20, 0.1);

	        ItemPedido item1 = new ItemPedido(p1, 3);
	        ItemPedido item2 = new ItemPedido(p2, 2);

	        Pedido pedido = new Pedido();
	        pedido.adicionarItem(item1);
	        pedido.adicionarItem(item2);

	        System.out.println("Valor total do pedido: R$" + pedido.calcularValorTotal());
	        System.out.println("Valor total de impostos: R$" + pedido.calcularValorImposto());
	    }
	}