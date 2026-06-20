public class produto {
    private final String nome;
    private final double preço;
    private int quantidade;

    public produto(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;

    }

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirDetalhes() {
        System.out.println("produto: " + nome + " | preço: R$" + preço + " | Qtd no Estoque: " + quantidade);
    }
}