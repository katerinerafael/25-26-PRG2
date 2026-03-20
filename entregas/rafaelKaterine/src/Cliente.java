package vistas.fraccion;

public class Cliente {
    public static void main(String[] args) {
        Console console = new Console();

        console.writeln("Introduce la primera fracción:");
        int numerador1 = console.readInt("Numerador: ");
        int denominador1 = console.readInt("Denominador: ");

        console.writeln("Introduce la segunda fracción:");
        int numerador2 = console.readInt("Numerador: ");
        int denominador2 = console.readInt("Denominador: ");

        Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
        Fraccion fraccion2 = new Fraccion(numerador2, denominador2);

        Fraccion resultado = fraccion1.sumar(fraccion2);

        console.writeln("Resultado: " + resultado);
    }
}