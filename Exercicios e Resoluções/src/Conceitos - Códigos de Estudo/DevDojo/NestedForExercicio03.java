public class NestedForExercicio03 {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            System.out.println("Tabuada do: "+i);
            // O primeiro numero
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + "x" + j + "="+(i*j));
                //Segundo numero da multiplicação, ira repetir até ser 10
            }


        }
    }
}
