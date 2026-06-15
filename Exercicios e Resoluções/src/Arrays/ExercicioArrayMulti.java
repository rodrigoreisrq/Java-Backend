package Inicio;

public class ExercicioArrayMulti {
    public static void main(String[] args) {
        int[][] exercicio = new int[3][3];
        
        exercicio[0][0] = 1;
        exercicio[0][1] = 2;
        exercicio[0][2] = 3;
        exercicio[1][0] = 4;
        exercicio[1][1] = 5;
        exercicio[1][2] = 6;
        exercicio[2][0] = 7;
        exercicio[2][1] = 8;
        exercicio[2][2] = 9;

        int soma =0;
        for (int i = 0; i < exercicio.length ; i++) {
            for (int j = 0; j < exercicio[i].length; j++) {
                    soma+=exercicio[i][j];
                }
            }
        System.out.println( soma);
        }
    }

