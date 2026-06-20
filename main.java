import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<produto> estoque = new ArrayList<>();

        estoque.add(new Smartphone("Galaxy S24", 5499.00, 10, 256));
        estoque.add(new Smartwatch("Galaxy Fit 3", 399.00, 25, false));
        estoque.add(new Smartphone("Iphone 15", 6299.00, 5, 128));
        estoque.add(new Smartwatch("Galaxy Watch 6", 1899.00, 8, true));

        System.out.println("=== RELATÓRIO DE ESTOQUE ===");
        double valorTotalInventario = 0;

        for (produto p : estoque) {
            p.exibirDetalhes();

            double valorprodutoTotal = p.getPreço() * p.getQuantidade();
            valorTotalInventario += valorprodutoTotal;
            System.out.println("---------------------------------------------");
        }

        System.out.printf("VALOR TOTAL DO INVENTÁRIO EM ESTOQUE: R$ %.2f%n", valorTotalInventario);
    }
}