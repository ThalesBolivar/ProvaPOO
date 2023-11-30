package pedido;

import pedidoItem.PedidoItem;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private ArrayList<PedidoItem> itensPedido;

    // Construtor
    public Pedido(int numeroPedido, double precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = new Date();
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
        this.itensPedido = new ArrayList<>();
    }

    // Getters e Setters
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public ArrayList<PedidoItem> getItensPedido() {
        return itensPedido;
    }

    // Método para inserir item no pedido
    public void inserirItensPedido(PedidoItem item) {
        if (item != null && item.atualizaEstoqueItem()) {
            this.itensPedido.add(item);
            this.statusPedido = 2; // Atualiza o status do pedido
            this.calcularTotalPagar();
        }
    }

    // Método para excluir item do pedido
    public void excluirItensPedido(PedidoItem item) {
        this.itensPedido.remove(item);
        this.calcularTotalPagar();
    }

    // Método para calcular total a pagar
    public double calcularTotalPagar() {
        double total = 0;
        for (PedidoItem item : this.itensPedido) {
            total += item.getPrecoItem() * item.getQuantidadeItem();
        }
        this.precoTotal = total;
        return total;
    }

    // Método para consultar pedido
    public boolean consultarPedido(Pedido pedido) {
        return this.numeroPedido == pedido.getNumeroPedido();
    }
}