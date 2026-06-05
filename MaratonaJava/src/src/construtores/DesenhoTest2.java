package sobrecargademetodos;

public class DesenhoTest {
    public static void main(String[] args) {
        Desenho desenho = new Desenho();
        desenho.init("Clarencio o Otimista", "Aventura", 100, "aventura");
        desenho.imprime();
    }
}
