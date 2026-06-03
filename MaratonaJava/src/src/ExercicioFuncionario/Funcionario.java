package ExercicioFuncionario;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimir() {
        System.out.println("Funcionário: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salario 1: " + this.salario[0]);
        System.out.println("Salario 2: " + this.salario[1]);
        System.out.println("Salario 3: " + this.salario[2]);
    }

    public double resultado() {
        int produto = 1;
        for (double salario : this.salario) {
            produto = (int) ((salario * salario * salario) / 3);
        }
        System.out.println(produto);
        return produto;
    }
}


