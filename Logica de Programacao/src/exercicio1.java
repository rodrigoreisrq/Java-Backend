import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        /*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salário: ");

        double salario = scanner.nextDouble();

        double salarioMinimo = 1621;
        int quantidade =  (int) salario / (int) salarioMinimo;


        System.out.println("Recebe aproximadamente: " + quantidade + " sálarios");
    }
}
