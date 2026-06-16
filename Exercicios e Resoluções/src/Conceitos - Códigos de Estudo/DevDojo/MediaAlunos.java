import java.util.Scanner;
public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota1 = scan.nextInt();
        int nota2 = scan.nextInt();
        int nota3 = scan.nextInt();
        int nota4 = scan.nextInt();
        int media = (nota1 + nota2 + nota3 + nota4);
        System.out.println(media);
        if(media > 50){
            System.out.println("Aluno aprovado");
        }else if(media == 50){
            System.out.println("Aluno em recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
}
