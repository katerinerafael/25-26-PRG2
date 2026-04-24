public class Pista {
    public int limite;

    public Pista(int limite) {
        this.limite = limite;
    }

    public void mostrar(Console console) {
        for (int i = 0; i < this.limite; i++) {
            console.write("-");
        }
        console.writeln();
    }
}