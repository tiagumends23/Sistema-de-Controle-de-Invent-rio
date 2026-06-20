public class Smartwatch extends produto {
    private final boolean temGps;

    public Smartwatch(String nome, double preço, int quantidade, boolean temGps) {
        super(nome, preço, quantidade);
        this.temGps = temGps;
}

    @Override
    public void exibirDetalhes() {
    super.exibirDetalhes();
    System.out.println("-> Especificação: " + (temGps ? "Possui GPS Integrado" : "Não possui GPS Integrado"));
    }

}
