public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Fraccion(Fraccion fraccion) {}
    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }
    public Fraccion(){}

    public Fraccion clonar(){}
}