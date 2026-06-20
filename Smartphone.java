public class Smartphone extends produto {
    private final int armazenamentoGb;

    public Smartphone(String nome, double preço, int quantidade, int armazenamentoGb) {
        super(nome, preço, quantidade);
        this.armazenamentoGb = armazenamentoGb;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("-> Especificação: " + armazenamentoGb + "GB de Armazenamento");
    }

}