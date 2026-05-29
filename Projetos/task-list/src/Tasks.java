import java.util.Scanner;
public class Tasks {
    Scanner scan = new Scanner(System.in);
        //Atributos
        String nome;
        String descricao;
        String data;
        String status;
        void status(){
            System.out.println("Tarefa "+ this.nome + " criada!");
        }

        void criarTarefa() {

            System.out.println("Digite o nome do tarefa: ");
            this.nome = scan.nextLine();
            System.out.println("Digite o descricao do tarefa: ");
            this.descricao = scan.nextLine();
            System.out.println("Digite a data do tarefa: ");
            this.data = scan.nextLine();
            System.out.println("Digite a status do tarefa: ");
            this.status = scan.nextLine();
            System.out.println("Tarefa " + this.nome + " criada! Com status " + this.status);
        }

        void editarTarefa(){
            System.out.println("Faça as alterações de nome:");
            this.nome = scan.nextLine();
            System.out.println("Nome alterado para: "+ this.nome);
            System.out.println("Digite a nova descricao do tarefa: ");
            this.descricao = scan.nextLine();
            System.out.println("Digite a data do tarefa: ");
            this.data = scan.nextLine();
            System.out.println("Digite a status do tarefa: ");
            this.status = scan.nextLine();
            System.out.println("Tarefa " + this.nome + " alterada! Com status " + this.status);

            }
            void deletarTarefa(){

            }


}




