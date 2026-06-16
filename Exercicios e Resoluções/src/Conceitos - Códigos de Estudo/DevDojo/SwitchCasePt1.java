import java.util.Scanner;

public class SwitchCasePt1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tipo de conta - Digie 1 para conta poupança - 2 para corrente - 3 para investimento");
        int tipoDaConta = input.nextInt();

        switch (tipoDaConta) {
            case 1:
                System.out.println("A porcentagem de juros para conta poupança é: 0,05%");
                break;
            case 2:
                System.out.println("A porcentage de juros para conta corrente é: 0.02%");
                break;
            case 3:
                System.out.println("A porcentagem de juros para conta de investimentos é: 0,01%");
                break;
            default:
                System.out.println("Conta inexistente");
        }


    }
}

