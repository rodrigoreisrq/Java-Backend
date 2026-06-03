package ExercicioFuncionario;

public class MainCorrecao {
    public static void main(String[] args) {

        FuncionarioCorrecao funcionario = new FuncionarioCorrecao();

        funcionario.nome = "Rodrigo";
        funcionario.idade = 18;
        funcionario.salarios = new double[]{2000, 3500, 3000};
        funcionario.imprime();

    }
}
