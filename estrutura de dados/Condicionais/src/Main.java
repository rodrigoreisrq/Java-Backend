public class Main {
    public static void main(String[] args) {

        int idade = 19;

        boolean idadeAutorizada = idade >= 18;
        if (idadeAutorizada) {
            System.out.println("Compra autorizada!");
            // } else{
            //      System.out.println("Compra nao autorizada!");
        } else if (!idadeAutorizada) { // ! - Serve como negação // Sempre vai fazer a analise
            System.out.println("Compra não autorizada!");

        } else {
            System.out.println("Compra não autorizada!");
        }

    }
}
