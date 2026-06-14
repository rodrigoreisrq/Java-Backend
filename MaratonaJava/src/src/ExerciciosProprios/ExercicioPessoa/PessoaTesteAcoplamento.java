package ExerciciosProprios;

public class PessoaTesteAcoplamento {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Leila");
        p1.setIdade(-2);
        //p1.imprime();
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
    }
}
