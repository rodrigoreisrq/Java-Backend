package ExerciciosProprios.src;

public class Lampada implements InterfaceLampada {
    /*
    Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar,desligar a lâmpada.
     */
    private String modelo;
    private String cor;
    private boolean ligada;

    public Lampada(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.ligada = false;
    }

    //    //private void ligar(){
//
//    //private void desligar(){
//        if(ligada == false){
//            System.out.println("Já está desligada!");
//        }else{
//            System.out.println("Desligando...Desligada!");
//            this.ligada = false;
//        }
//    }
    @Override
    public void ligar() {
        if (ligada == true) {
            System.out.println("Já está ligada!");
        } else {
            System.out.println("Ligando...Ligada!");
            this.ligada = true;
        }


    }


    @Override
    public void desligar() {
        if (ligada == false) {
            System.out.println("Já está desligada!");
        } else {
            System.out.println("Desligando...Desligada!");
            this.ligada = false;

        }
    }
}
