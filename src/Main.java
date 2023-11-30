import categoria.Categoria;
import pedido.Pedido;
import pedidoItem.PedidoItem;
import poduto.Produto;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criar objetos de Categoria
        Categoria categoria1 = new Categoria("Bebidas");
        Categoria categoria2 = new Categoria("Alimentos");

        // Criar objetos de Produto
        Produto produto1 = new Produto("Refrigerante", 3.5, "Bebida gaseificada", 100, categoria1);
        Produto produto2 = new Produto("Arroz", 5.0, "Alimento básico", 50, categoria2);
        Produto produto3 = new Produto("Feijão", 4.0, "Alimento básico", 30, categoria2);
        Produto produto4 = new Produto("Água Mineral", 2.0, "Água potável", 80, categoria1);
        Produto produto5 = new Produto("Chocolate", 2.5, "Doce", 40, categoria2);

        // Criar objetos de PedidoItem
        PedidoItem item1 = new PedidoItem("Refrigerante", 2, produto1.getPrecoProduto());
        PedidoItem item2 = new PedidoItem("Arroz", 3, produto2.getPrecoProduto());
        PedidoItem item3 = new PedidoItem("Feijão", 1, produto3.getPrecoProduto());
        PedidoItem item4 = new PedidoItem("Água Mineral", 5, produto4.getPrecoProduto());

        // Criar objetos de Pedido
        Pedido pedido1 = new Pedido(1, 0, 1);
        Pedido pedido2 = new Pedido(2, 0, 1);

        // Adicionar produtos a um ArrayList de Produtos
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        listaProdutos.add(produto5);

        // Adicionar pedidos a um ArrayList de Pedidos
        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        // Inserir itens nos pedidos
        pedido1.inserirItensPedido(item1);
        pedido1.inserirItensPedido(item2);
        pedido1.inserirItensPedido(item3);

        pedido2.inserirItensPedido(item2);
        pedido2.inserirItensPedido(item4);

        // Imprimir informações no terminal
        System.out.println("Lista de Produtos:");
        for (Produto produto : listaProdutos) {
            System.out.println("Nome: " + produto.getNomeProduto());
            System.out.println("Preço: " + produto.getPrecoProduto());
            System.out.println("Descrição: " + produto.getDescProduto());
            System.out.println("Estoque Atual: " + produto.getEstoqueAtual());
            System.out.println("Categoria: " + produto.getCategoria().getDescCategoria());
            System.out.println("---------------------------");
        }

        System.out.println("\nLista de Pedidos:");
        for (Pedido pedido : listaPedidos) {
            System.out.println("Número do Pedido: " + pedido.getNumeroPedido());
            System.out.println("Data e Hora do Pedido: " + pedido.getDataHoraPedido());
            System.out.println("Preço Total: " + pedido.getPrecoTotal());
            System.out.println("Status do Pedido: " + pedido.getStatusPedido());
            System.out.println("Itens do Pedido:");
            for (PedidoItem item : pedido.getItensPedido()) {
                System.out.println("  Nome do Item: " + item.getNomeItem());
                System.out.println("  Quantidade: " + item.getQuantidadeItem());
                System.out.println("  Preço Unitário: " + item.getPrecoItem());
                System.out.println("---------------------------");
            }
            System.out.println("---------------------------");
        }
    }
}
