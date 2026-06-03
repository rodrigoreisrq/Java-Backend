package ExercicioFuncionario;

public class FuncionarioCorrecao {
    public String nome;
    public int idade;
    public double[] salarios;


    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }

        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {

        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;


        System.out.println("\nMédia salarial: " + media);
    }
}
