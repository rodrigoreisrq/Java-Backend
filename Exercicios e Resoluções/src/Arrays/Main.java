package Inicio;

public class Main {
    public static void main(String[] args) {
        double valorTotal = 50000;
        for(int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
               break; // Quando a parcela fica menor que 1000, o break para o precessamento pq senao iria continuar.
            }
             System.out.println("Parcela "+ parcela + " R$ "+valorParcela);

        }
    }
}