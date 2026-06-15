package Inicio;

public class Continue {
    public static void main(String[] args) {
        double valor = 30000;
        for(int parcela = (int) valor; parcela >= 1; parcela --){
            double valorParcela = valor / parcela;
            if(valorParcela < 1000){
                continue; // Não vá para linha 9 até que a parcela seja menor que 1000
            }
            System.out.println("Parcela "+ parcela + " R$ "+valorParcela);
        }
    }
}
