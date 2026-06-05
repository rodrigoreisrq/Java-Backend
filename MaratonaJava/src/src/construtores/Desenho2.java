package construtores;

public class Desenho2 {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    /*Construtor serve para iniciar primeiro, e dar obrigações ao objeto, oque DEVE ter
    * recebe um valor padrao*/
    public Desenho2(String nome, String tipo, int episodios,  String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;


    }
    public Desenho2(String nome, String tipo, int episodios,  String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        this.genero = genero;
    }

    public Desenho2(){
        //construtor vazio - permite a criação de um objeto vazio

    }

//    public void init(String nome, String tipo, int episodios){
//        this.nome = nome;
//        this.tipo = tipo;
//        this.episodios = episodios;
//
//    }
//    public void init(String nome, String tipo, int episodios,  String genero){
//        this.init(nome,tipo,episodios);
//        this.genero = genero;
//
//    }

    public void imprime(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodios: " + this.episodios);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Estúdio: " + this.estudio);
    }
    //public void setNome(String nome){
   //     this.nome = nome;
   // }
    public String getNome(){
        return this.nome;
    }

    //public void setTipo(String tipo){
   ////     this.tipo = tipo;
  //  }
    public String getTipo(){
       return this.tipo;
    }
    ////public void setEpisodios(int episodios){
   //     this.episodios = episodios;
   // }
    public int getEpisodios(){
        return this.episodios;
    }

    public String getGenero() {
        return genero;
    }

   /// public void setGenero(String genero) {
   //     this.genero = genero;
   // }
}
