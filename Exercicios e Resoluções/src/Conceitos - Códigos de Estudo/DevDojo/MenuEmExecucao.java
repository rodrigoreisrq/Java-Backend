
import java.util.Scanner;

public class MenuEmExecucao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resposta = scan.nextInt();
        while (true) {
            switch (resposta) {
                case 1:
                    System.out.println("Oi");
                    break;
                case 2:
                    System.out.println("zap");
                    break;

            }
            if (resposta == 0) {
                break;
            }
        }
    }
}




