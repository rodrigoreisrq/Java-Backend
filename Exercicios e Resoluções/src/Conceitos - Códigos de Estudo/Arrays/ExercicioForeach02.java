package Inicio;

public class ExercicioForeach02 {
    public static void main(String[] args) {
        String[]nomes = new String[]{
                "Rodrigo", "Letty", "Thaísa", "João", "Leila", "Fernanda"
        };
        for(String nome:nomes){
            System.out.println(nome);
        }
    }
}
