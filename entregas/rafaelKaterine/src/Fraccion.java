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
    public void sumar(Fraccion fraccion) {}
    public void restar(Fraccion fraccion) {}
    public void multiplicar(Fraccion fraccion) {}
    public void dividir(Fraccion fraccion) {}
    public void exponenciar(int exponente) {}

    public void mostrar() {}
    public boolean equals(Fraccion fraccion) {}
    public boolean esMayor(Fraccion fraccion) {}
    public boolean esMenor(Fraccion fraccion) {}
    
    public void invertir() {}



} 