package ExerciciosProprios;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Rodrigo");
        aluno.setNota1(1);
        aluno.setNota2(4);
        aluno.calcularMedia();
        aluno.verificarSituacao();
        System.out.println(aluno.getMedia());
    }
}
