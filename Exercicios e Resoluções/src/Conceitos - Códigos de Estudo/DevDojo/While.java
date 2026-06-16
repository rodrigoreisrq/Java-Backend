import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        final String login = "Rodrigo";
        final String password = "rdz";
        boolean exibirTelaLogin = true;
        Scanner scan = new Scanner(System.in);
        while (exibirTelaLogin) {
            System.out.println("Digite seu login:");
            String loginDigitado = scan.nextLine();
            System.out.println("Digite sua senha:");
            String passwordDigitado = scan.nextLine();
            if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
                System.out.println("Acesso concedido");
                exibirTelaLogin = false;
            } else {
                System.out.println("Acesso negado");
            }
        }
    }
}
