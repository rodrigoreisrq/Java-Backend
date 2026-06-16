import java.util.Scanner;

public class ExercicioVetoresMelhorado {


    public static void main(String[] args) {


        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner input = new Scanner(System.in);
        String resultado = " ";
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1, posição: " + (i + 1));
            array1[i] = input.nextInt();
            System.out.println("Vetor 2, posição: " + (i + 1));
            array2[i] = input.nextInt();
            array3[i] = array1[i] * array2[i];
            resultado = resultado + array3[i];
        }
        System.out.println("Resultado " + resultado);
    }
}