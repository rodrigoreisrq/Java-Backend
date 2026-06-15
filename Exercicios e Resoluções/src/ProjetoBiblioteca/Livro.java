package biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public void status() {
        System.out.println("Livro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Disponibilidade: " + this.disponivel);
    }

    public Livro(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (this.disponivel != true) {
            System.out.println("Livro indisponível.");
        } else {
            System.out.println("Livro emprestado com sucesso.");
            this.disponivel = false;
        }

    }

    public void devolver() {
        System.out.println("Livro devolvido.");
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
