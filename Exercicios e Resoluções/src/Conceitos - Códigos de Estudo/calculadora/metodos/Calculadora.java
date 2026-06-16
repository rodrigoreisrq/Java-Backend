package calculadora.metodos;

public class Calculadora {
    public void somar() {
        System.out.println(5 + 4);
    }

    public void subtrair() {
        System.out.println(5 - 4);
    }

   public double multiplicaDoisNumeros(int x, int y) {
      System.out.println(x * y);
        //Parâmetros == (int x, int y)
       return x * y;

   }

    public double divideDoisNUmeros(double x, double y){
        if(x == 0 && y == 0 ){
            return 0;
        }
        return x / y;
    }

    public void multiplicaNumeros(int x, int y){
        if(x == 0 || y == 0){
            System.out.println("Não é possível multiplicar por 0");
            return; /*Se a condição for falsa, encerra o código logo --- regra de negócio depois*/
        }
        System.out.println(x * y);
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 100;
        num2= 54;

    }

    public void somaArray(int [] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int...numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    }




