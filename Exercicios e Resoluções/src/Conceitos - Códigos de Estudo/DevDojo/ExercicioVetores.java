import java.util.Scanner;

public class ExercicioVetores {
    public static void main(String[] args) {
//        int[]vetor1 =  {1,3,5,6,5};
//        int[]vetor2 = {2,3,7,5,3};
//        int[]vetor3 = {2,3,7,5,3};
//
//        for (int i = 0; i < ; i++) {
//            
//        }

        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1, posição: " + (i + 1));
            array1[i] = input.nextInt();


        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 2, posição: " + (i + 1));
            array2[i] = input.nextInt();
        }
        System.out.println("Vetor 3, multiplicação");
        for (int i = 0; i < array1.length; i++) {

            array3[i] = array1[i] * array2[i];
            System.out.println(array3[i] + " ");        }
    }
}
