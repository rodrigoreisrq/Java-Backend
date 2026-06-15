package ExercicioFuncionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario();

        System.out.println("Digite o nome do funcionario: ");
        funcionario1.nome = sc.nextLine();

        System.out.println("Digite o idade do funcionario: ");
        funcionario1.idade = sc.nextInt();

        System.out.println("Digite os três salários do funcionário: ");
        funcionario1.salario = new double[]{sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};

        funcionario1.imprimir();
        funcionario1.resultado();
    }
}
