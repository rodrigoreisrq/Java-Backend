
import java.util.Scanner;

public class ContagemDeImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int valorDigitado = scan.nextInt();


        /*while(numero <= valorDigitado){
            System.out.println(numero);
            numero+=2;
        */
        while (numero <= valorDigitado) {
            if (numero % 2 != 0) {
                System.out.println(numero);

            }numero++;
        }
    }
}
