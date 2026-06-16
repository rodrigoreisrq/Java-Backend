import java.util.Scanner;

public class JogoNumerosIguais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        boolean desejaContinuar = true;

        do {
            System.out.println("Digite um numero: ");
            int numeroUser1 = scan.nextInt();
            System.out.println("Digite um numero: ");
            int numeroUser2 = scan.nextInt();
            if (numeroUser1 == numeroUser2) {
                System.out.println("Numeros iguais!");
            } else {
                System.out.println("Numeros diferentes!");
            }
            System.out.println("Deseja continuar? (S/N)");
            String continuar = scan.next();
            if (continuar.equalsIgnoreCase("N")) {
                desejaContinuar = false;
            }

        } while (desejaContinuar == true);


    }
}


