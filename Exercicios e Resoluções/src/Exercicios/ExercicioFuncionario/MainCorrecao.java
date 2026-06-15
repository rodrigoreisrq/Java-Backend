package ExercicioFuncionario;

public class MainCorrecao {
    public static void main(String[] args) {

        FuncionarioCorrecao funcionario = new FuncionarioCorrecao();

        funcionario.setNome("Rodrigo");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[]{2000, 3500, 3000});
        funcionario.imprime();

    }
}
