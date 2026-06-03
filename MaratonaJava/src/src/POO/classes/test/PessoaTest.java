package POO.classes.test;

import POO.classes.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Rodrigo";
        pessoa1.sexo = 'M';
        pessoa1.idade = 18;
        System.out.println(pessoa1.nome);
    }
}
