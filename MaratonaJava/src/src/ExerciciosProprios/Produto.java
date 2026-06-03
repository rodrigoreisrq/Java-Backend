package ExerciciosProprios;

public class Produto {
    private String nome;
    private int preco;
    private int quantidade;

    private double valorTotal;


    public void adicionarEstoque(){
        if(nome.equals("") && preco == 0 && quantidade == 0){
            System.out.println("Não foi possível adicionar este produto!");
        }else{
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;

            System.out.println("Estoque adicionado com sucesso!");
        }

    }
    public void removerEstoque(){
        this.nome = null;
        this.preco = 0;
        this.quantidade = 0;
        System.out.println("Estoque removido com sucesso!");
    }
    public void valorTotalEstoque(){
        valorTotal = valorTotal + preco * quantidade;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public double getValorTotal() {
        return valorTotal;
    }
}
