package calculadora.test;

import calculadora.metodos.Calculadora;

public class Test {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somar();
        calculadora.subtrair();
        //calculadora.multiplicaDoisNumeros(3, 2);
        /* Argumentos == (8, 2)*/
        double result = calculadora.divideDoisNUmeros(0, 0);
        System.out.println(result);

        calculadora.multiplicaNumeros(231, 8);

    }
}