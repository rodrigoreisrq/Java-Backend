package modificadoresstatic;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    //O metodo static garante que todos os objetos (carro) tenham um valor padrao
    //Faz o atributo pertencer a classe e todos os objetos terão esse msm valor
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprime() {
        System.out.println("------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Velocidade Maxima: " + velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }
    public static double getVelocidadeLimite(){
        return velocidadeLimite;

    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }



}