package ExerciciosProprios;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Macbook");
        produto1.setQuantidade(10);
        produto1.setPreco(4000);

        produto1.adicionarEstoque();

        System.out.println("Produto: "+produto1.getNome());
        System.out.println("Preço: "+produto1.getPreco());
        System.out.println("Quantidade: "+produto1.getQuantidade());
        produto1.valorTotalEstoque();
        System.out.println("Valor total: "+produto1.getValorTotal());

        Produto produto2 = new Produto();
        produto2.setNome("Iphone 17");
        produto2.setQuantidade(2);
        produto2.setPreco(7500);
        produto2.adicionarEstoque();
        System.out.println("Produto: "+produto2.getNome());
        System.out.println("Preço: "+produto2.getPreco());
        System.out.println("Quantidade: "+produto2.getQuantidade());
        produto2.valorTotalEstoque();
        System.out.println("Valor total: "+produto2.getValorTotal());

        Produto produto3 = new Produto();
        produto3.setNome("");
        produto3.setQuantidade(0);
        produto3.setPreco(0);
        produto3.adicionarEstoque();


    }
}
