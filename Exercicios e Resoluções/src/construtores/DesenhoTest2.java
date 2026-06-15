package construtores;

import sobrecargademetodos.Desenho;

public class DesenhoTest2 {
    public static void main(String[] args) {
        Desenho2 desenho = new Desenho2("Zap", "mensagem", 3, "familia", "Disney");
        Desenho2 desenho2 = new Desenho2(); // objeto vazio
        desenho.imprime();
    }
}
