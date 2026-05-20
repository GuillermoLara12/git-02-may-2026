package mx.edu.utez;

public class calculadora {

    private double numero1;
    private double numero2;

    public calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double suma() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }
}
