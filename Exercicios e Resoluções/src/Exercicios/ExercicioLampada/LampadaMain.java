package ExerciciosProprios.src;

public class LampadaMain {
    public static void main(String[] args) {
        Lampada[] lampada = new Lampada[2];
        lampada[0] = new Lampada("Incandescente", "amarelo");
        lampada[1] = new Lampada("Led", "branco");

        lampada[0].ligar();
        lampada[0].desligar();
        lampada[1].desligar();
        lampada[1].ligar();
        lampada[1].desligar();

    }
}
