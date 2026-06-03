package ExerciciosProprios;

public class ExercicioBanco {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();

        cb.titular = "Rodrigo";
        cb.saldo = 500;
        cb.depositar();
        cb.sacar();
        cb.exibirSaldo();
    }
}
