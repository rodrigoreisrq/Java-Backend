package Inicio;

public class ArraysMultidimensionais02{
    public static void main(String[] args) {
        int[][]arrayInt = new int[3][];

        arrayInt[0] = new int[]{18,20};
        arrayInt[1] = new int[]{22,95,23};
        arrayInt[2] = new int[]{27, 34, 12, 3};

        for(int [] arrayBase: arrayInt){
            System.out.println("\n----------");
            for(int num: arrayBase){
                System.out.print(num+ " ");
                // Primeiro array == 00
                // Segundo array == 000
                // Terceiro array == 000000
            }
        }
    }
}
