package Inicio;

public class Array02 {
    public static void main(String[] args) {
        String[] nomes = {"Rodrigo", "Joanice", "João", "Leticia", "Angélica"};
//        nomes[0] = "Rodrigo";
//        nomes[1] = "Joanice";
//        nomes[2] = "João";
        StringBuilder sb = new StringBuilder();
        for(String nome : nomes){
            sb.append(nome).append("\n");
        }
        System.out.println(sb);

//        for (int i = 0; i < nomes.length; i++) {
//            System.out.println(nomes[i]);
//
//        }
    }
}
