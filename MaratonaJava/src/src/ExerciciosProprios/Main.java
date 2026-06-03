package ExerciciosProprios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);

        pessoa.nome = sc.nextLine();
        pessoa.idade = sc.nextInt();
        pessoa.apresentar();

    }
}
