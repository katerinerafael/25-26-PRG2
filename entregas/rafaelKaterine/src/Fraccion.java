public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Fraccion(Fraccion fraccion) {
        this(fraccion.numerador, fraccion.denominador);
    }
    public Fraccion(int numerador) {
            this(numerador, 1);
    }
    public Fraccion(){
    }

    public Fraccion clonar(){
        return new Fraccion(this);
    }
    public Fraccion valorAbsoluto(){}

    public void mostrar() {
        Console console = new Console();
        console.writeln("[" + numerador + "," + denominador + "]");
    }
    
    public void invertir() {
    }
    public void oponer() {}

    public void sumar(Fraccion fraccion) {
        numerador = (this.numerador * fraccion.denominador) + (this.denominador * fraccion.numerador);
        denominador = this.denominador * fraccion.denominador;
    }
    public void restar(Fraccion fraccion) {
        numerador = (this.numerador * fraccion.denominador) - (this.denominador * fraccion.numerador);
        denominador = this.denominador * fraccion.denominador;
    }
    public void multiplicar(Fraccion fraccion) {}
    public void dividir(Fraccion fraccion) {}
    public void exponenciar(int exponente) {}
    public boolean equals(Fraccion fraccion) {}
    public boolean esMayor(Fraccion fraccion) {}
    public boolean esMenor(Fraccion fraccion) {}

    public String toString() {
        return "[" + numerador + "," + denominador + "]";
    }

} 