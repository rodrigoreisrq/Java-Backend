import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        // Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
        //antecessor e seu sucessor.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = scanner.nextInt();

        int antecessor = number - 1;
        int sucessor = number + 1;

        System.out.println("Número: " + number);
        System.out.println("Antecessor: " + antecessor );
        System.out.println("Sucessor: " + sucessor);

    }
}
