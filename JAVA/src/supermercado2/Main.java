package supermercado2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 5.99, 10, 0.05));
        produtos.add(new Produto("Feijão", 4.99, 20, 0.1));

        Pedido pedido = new Pedido();

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 2) {
            System.out.println("Selecione um produto:");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println(i + 1 + ". " + produtos.get(i).getNome());
            }
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= produtos.size()) {
                Produto produtoSelecionado = produtos.get(opcao - 1);

                System.out.println("Digite a quantidade desejada:");
                int quantidade = scanner.nextInt();

                ItemPedido item = new ItemPedido(produtoSelecionado, quantidade);
                pedido.adicionarItem(item);

                System.out.println("Produto adicionado ao pedido.");
            } else if (opcao != 0) {
                System.out.println("Opção inválida.");
            }
        }

        System.out.println("Valor total do pedido: R$" + pedido.calcularValorTotal());
        System.out.println("Valor total de impostos: R$" + pedido.calcularValorImposto());
        
        scanner.close();
    }
}