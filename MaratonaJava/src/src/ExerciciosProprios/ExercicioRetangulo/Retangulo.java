package ExerciciosProprios;

public class Retangulo {
    public double base;
    public double altura;

    public double calculaArea() {

        double area = base * altura;
        System.out.println("Area do retangulo: " + area);
        return area;
    }

    public double calculaPerimetro() {
        //P=2×(b+h);
        double perimetro = 2 * (base + altura);
        System.out.println("Perimetro do retangulo: " + perimetro);
        return perimetro;
    }
}
