package funcionario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        if (salario < 0) {
            System.out.println("Não é possível adicionar este valor, pois é negativo.");
        } else {
            this.salario = salario;
        }

    }
    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public double setSalario(double salario) {
        if (salario < 0) {
            System.out.println("Não é possível adicionar este valor, pois é negativo.");
        } else {
            this.salario = salario;

        }
        return this.salario;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }
}
