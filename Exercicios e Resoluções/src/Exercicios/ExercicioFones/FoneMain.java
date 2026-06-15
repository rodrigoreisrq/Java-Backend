public class FoneMain {
    public static void main(String[] args) {
        Fones fone1 = new Fones();

        fone1.modelo = "FN-BJ3";
        fone1.cor = "Branco";
        fone1.carga = 1;
        //fone1.ligar();
        //fone1.carregar();
        //fone1.status();

        Fones fone2 = new Fones();
        fone2.modelo = "AirPods";
        fone2.cor = "Branco";
        fone2.carga = 0;
        fone2.carregar();
        fone2.ligar();
        fone2.status();
    }
}
