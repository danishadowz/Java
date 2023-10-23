package triangulo;

public class Triangulo {

    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Triangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura)/2;
    }

    public double calcularPerimetro(){
        return base * 3;
    }
}
