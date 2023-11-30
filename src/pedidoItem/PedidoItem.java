package pedidoItem;

public class PedidoItem {
    private String nomeItem;
    private int quantidadeItem;
    private double precoItem;

    public PedidoItem(String feijão, int i, double precoProduto) {
    }

    // Construtor
    public void PedidoItem(String nomeItem, int quantidadeItem, double precoItem) {
        this.nomeItem = nomeItem;
        this.quantidadeItem = quantidadeItem;
        this.precoItem = precoItem;
    }

    // Getters e Setters
    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    // Método para atualizar estoque do item
    public boolean atualizaEstoqueItem() {
        // Implemente a lógica de atualização de estoque aqui
        return true; // Retorno de exemplo
    }
}