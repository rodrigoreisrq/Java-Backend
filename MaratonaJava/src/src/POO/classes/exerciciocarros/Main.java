package POO.classes.exerciciocarros;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Mercedes";
        carro1.modelo = "M3";
        carro1.ano = 2018;


        carro2.nome = "Porche";
        carro2.modelo = "911";
        carro2.ano = 2016;

        System.out.println("Carro 1: " + carro1.nome + " "+carro1.modelo + " "+ carro1.ano);
        System.out.println("Carro 2: " + carro2.nome + " "+carro2.modelo + " "+ carro2.ano);
    }
}
