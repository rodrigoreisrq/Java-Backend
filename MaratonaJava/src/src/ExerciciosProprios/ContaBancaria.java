package ExerciciosProprios;

import java.util.Scanner;

public class ContaBancaria {
    public String titular;
    public double saldo;
    Scanner sc = new Scanner(System.in);





    public void depositar() {

        System.out.println("Digite o valor do deposito: ");
        double deposito = sc.nextDouble();
        if (deposito == 0) {
            System.out.println("Não é possível depositar um valor inválido");
        } else {
            saldo = deposito + saldo;
            System.out.println("Deposito realizado com sucesso!" + saldo);
        }


    }

    public void sacar() {
        System.out.println("Digite o valor do saque: ");
        double saque = sc.nextDouble();
        if (saque == 0) {
            System.out.println("Não é possível sacar um valor inválido");
        } else {
            saldo = saldo - saque;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }
}