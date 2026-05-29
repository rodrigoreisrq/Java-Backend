package Inicio;

public class ExercicioForeach {
    public static void main(String[] args) {
        int[] numeros = new int[]{1,4,10,5,22};
        for(int i:numeros){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }




}
