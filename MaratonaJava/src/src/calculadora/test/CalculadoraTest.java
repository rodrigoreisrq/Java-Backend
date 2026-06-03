package calculadora.test;

import calculadora.metodos.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(10,20,30,40); // VarArgs é mais simples de fazer -- uma sintaxe mais fácil
    }

}
