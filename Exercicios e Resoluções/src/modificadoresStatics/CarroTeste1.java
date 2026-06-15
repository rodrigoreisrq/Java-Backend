package modificadoresstatic;

public class CarroTeste1 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 260);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Bugatti ", 280);

      Carro.setVelocidadeLimite(180); // Afeta todos os objetos
        c1.imprime();
        c2.imprime();
        c3.imprime();


        //
    }
}
