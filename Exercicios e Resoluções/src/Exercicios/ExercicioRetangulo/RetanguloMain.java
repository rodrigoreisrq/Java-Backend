package ExerciciosProprios;

import java.util.Scanner;

public class RetanguloMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        retangulo.base = sc.nextDouble();
        retangulo.altura = sc.nextDouble();
        retangulo.calculaArea();
        retangulo.calculaPerimetro();
    }
}
