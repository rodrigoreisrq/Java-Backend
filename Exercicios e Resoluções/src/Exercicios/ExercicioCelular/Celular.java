package ExerciciosProprios;

public class Celular {
    private String modelo;
    private double preco;

    public Celular(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }
    public void listarCelulares(){
        System.out.println("-----------------------");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço: " + this.preco);
    }
}
