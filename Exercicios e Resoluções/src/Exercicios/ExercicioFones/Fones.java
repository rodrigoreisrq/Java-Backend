public class Fones {
    String modelo;
    String cor;
    int carga;
    boolean ligado;
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está ligado?  " + this.ligado);
        System.out.println("Qual a porcentagem da carga?  " + this.carga + "%");

    }
    void ligar(){
        this.ligado = true;
        if(carga == 0){
            this.ligado = false;
        }

    }
    void desligar(){
        this.ligado = false;
    }
    void carregar(){
        while(carga < 100){
            carga++;
            System.out.println("Carregando: " + carga);
            if(carga == 100){
                System.out.println("Totalmente carregado!");
            }
        }

    }
}
