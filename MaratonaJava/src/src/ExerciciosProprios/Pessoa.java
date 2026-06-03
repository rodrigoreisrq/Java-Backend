package ExerciciosProprios;

/* Nível 1 — Lógica + Classes
Exercício 1 — Pessoa

Crie uma classe Pessoa com:

nome
idade

Métodos:

apresentar()

Saída esperada:

Olá, meu nome é Rodrigo e tenho 20 anos.*/
public class Pessoa {
    public String nome;
    public int idade;

    public void apresentar(){
        System.out.println("Olá, meu nome é "+ this.nome + " e tenho " + this.idade + " anos.");
    }
}
