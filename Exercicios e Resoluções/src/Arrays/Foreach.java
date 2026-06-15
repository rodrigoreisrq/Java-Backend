package Inicio;

public class Foreach {
    public static void main(String[] args) {
        // Três formas de inicializar um Array
        int[] numeros = new int[3];
        int[]numeros2 = {1,2,3,4,5};
        int[]numeros3 = new int[]{1,2,3,4,5};

        for(int num:numeros3){
            System.out.println(num);
        }
    }
}
