import java.util.Random;
public class Caballo {
    public String alias;
    public int posicion = 0;
        
    public Caballo(String alias) {
        this.alias = alias;
    }

    public void avanzar(int limite) {
        int avance = new Random().nextInt(3);
        this.posicion += avance;
        if (this.posicion > limite) {
            this.posicion = limite;
        }
    }

    public void mostrar(Console console) {
        for (int i = 0; i < this.posicion; i++) {
            console.write(" ");
        }
        console.writeln(";-;' " + this.alias);
    }
}
