package ExerciciosProprios;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;


    public void calcularMedia(){
        media = (nota1 + nota2) / 2;
    }
    public void verificarSituacao(){
        if(media >= 5){
            System.out.print("Aprovado, com média: ");
        } else if(media == 5){
            System.out.print("Recuperação, com média: ");
        } else{
            System.out.print("Reprovado, com média: ");
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }



    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getMedia() {
        return this.media;
    }
}
