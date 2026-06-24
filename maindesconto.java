import java.util.ArrayList;
import java.util.List;

public class maindesconto {
    public static void main(String[] args) {
        List<produto> estoque = new ArrayList<>();

        estoque.add(new Smartphone("Galaxy S24", 5499.00, 10, 256));
        estoque.add(new Smartwatch("Galaxy Fit 3", 399.00, 25, false));
        estoque.add(new Smartphone("Iphone 15", 6299.00, 5, 128));
        estoque.add(new Smartwatch("Galaxy Watch 6", 1899.00, 8, true));

        System.out.println("=== APLICANDO PROMOÇÕES ===");

        for(produto p : estoque) {
            if (p.getNome().equals("Galaxy S24")) {
                p.aplicarCupom(10);
            }
        }
        System.out.println("=== RELATÓRIO DE ESTOQUE ATUALIZADO ===");
        double valorTotalInventario = 0;

        for (produto p : estoque) {
            p.exibirDetalhes();

            double valorProdutoTotal = p.getPreço() * p.getQuantidade();
            valorTotalInventario += valorProdutoTotal;
            System.out.println("---------------------------------------------");
        }
        
        System.out.printf("VALOR TOTAL DO INVENTÁRIO EM ESTOQUE: R$ %.2f%n", valorTotalInventario);
    }
}