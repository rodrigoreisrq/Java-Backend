package calculadora.test;

import calculadora.metodos.Estudante;
import calculadora.metodos.ImpirmirEstudantes;

public class EstudanteTeste {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        //ImpirmirEstudantes imprime = new ImpirmirEstudantes();

        estudante.nome = "Rodrigo";
        estudante.idade = 18;
        estudante.sexo = 'M';

        estudante2.nome = "Reis";
        estudante2.idade = 19;
        estudante2.sexo = 'M';

        //imprime.imprimir(estudante);
        //imprime.imprimir(estudante2);

        estudante.imprime();
        estudante2.imprime();

    }
}
