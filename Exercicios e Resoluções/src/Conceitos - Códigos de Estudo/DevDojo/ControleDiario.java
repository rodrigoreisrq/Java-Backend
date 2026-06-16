import java.util.Scanner;
public class ControleDiario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Menu.mostrarMenu();
        System.out.println("Para sair digite 6");
        int notaDoDia = scan.nextInt();
        int respostaSair = scan.nextInt();
        while (true) {

            switch (notaDoDia) {
                case 1:
                    System.out.println("Dia muito ruim. Escreva o motivo");
                    String motivo = scan.nextLine();
                    break;
                case 2:
                    System.out.println("Dia ruim. Escreva o motivo");
                    String motivo2 = scan.nextLine();
                    break;

                case 3:
                    System.out.println("Dia moderado. Escreva o motivo");
                    String motivo3 = scan.nextLine();
                    break;

                case 4:
                    System.out.println("Dia ruim. Escreva o motivo");
                    String motivo4 = scan.nextLine();
                    break;

                case 5:
                    System.out.println("Dia ruim. Escreva o motivo");
                    String motivo5 = scan.nextLine();
                    break;
                    
            }
            if (respostaSair == 6) {
                break;
            }
        }

    }
}

