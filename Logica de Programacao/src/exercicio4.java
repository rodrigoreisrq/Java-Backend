import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        /*Criar um programa que calcule a média de salários de uma empresa,
         pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os salários dos funcionários: ");
        double salarioFuncionario1 = scanner.nextDouble();
        double salarioFuncionario2 = scanner.nextDouble();
        double salarioFuncionario3 = scanner.nextDouble();
        double salarioFuncionario4 = scanner.nextDouble();

        double somaSalarial = salarioFuncionario1 + salarioFuncionario2 + salarioFuncionario3;
        double mediaSalarial = somaSalarial / 4;

        System.out.println("A média salarial da empresa é: " + mediaSalarial);

    }
}
