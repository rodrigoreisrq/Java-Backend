public class Main {
    public static void main(String[] args) {
    // Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
        // números 4, 5 e 6. A soma das duas médias. A média das médias.

        int numero1 = 8;
        int numero2 = 9;
        int numero3 = 7;
        // Primeira média
        int soma = numero1 + numero2 + numero3;
        int media1 = soma / 3;
        System.out.println("Resultado: " + media1);

        int numero4 = 4;
        int numero5 = 5;
        int numero6 = 6;

        int soma2 = numero4 + numero5 + numero6;
        int media2 = soma2 / 3;
        System.out.println("Resultado: " + media2);

        // Soma das média
        int somaMedias = media1 + media2;
        System.out.println("Resultado: " + somaMedias);

        //Media das médias
        int mediaMedias = somaMedias / 2;
        System.out.println("Resultado: " + mediaMedias);


    }
}