package biblioteca;

public class BibliotecaMain {
    public static void main(String[] args) {
        Livro livro = new Livro("Clean Code", "Robert C. Martin", true);

        livro.emprestar();
        //livro.devolver();
        livro.status();
    }
}
