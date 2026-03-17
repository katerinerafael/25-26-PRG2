
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
        this(0, 1);
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
        int auxiliar = this.numerador;
        this.numerador = this.denominador;
        this.denominador = auxiliar;
    }
    public void oponer() {
        this.numerador = -this.numerador;
    }

    public void sumar(Fraccion fraccion) {
        numerador = (this.numerador * fraccion.denominador) + (this.denominador * fraccion.numerador);
        denominador = this.denominador * fraccion.denominador;
    }
    public void restar(Fraccion fraccion) {
        numerador = (this.numerador * fraccion.denominador) - (this.denominador * fraccion.numerador);
        denominador = this.denominador * fraccion.denominador;
    }
    public void multiplicar(Fraccion fraccion) {
        numerador = this.numerador * fraccion.numerador;
        denominador = this.denominador * fraccion.denominador;
    }
    public void dividir(Fraccion fraccion) {
        numerador = this.numerador * fraccion.denominador;
        denominador = this.denominador * fraccion.numerador;
    }
    public void exponenciar(int exponente) {
        numerador = (int) Math.pow(numerador, exponente);
        denominador = (int) Math.pow(denominador, exponente);
    }
    public boolean equals(Fraccion fraccion) {
    }
    public boolean esMayor(Fraccion fraccion) {
        return (this.numerador * fraccion.denominador) > (this.denominador * fraccion.numerador);
    }
    public boolean esMenor(Fraccion fraccion) {
        return (this.numerador * fraccion.denominador) < (this.denominador * fraccion.numerador);
    }

    public String toString() {
        return "[" + numerador + "," + denominador + "]";
    }

} 