public class Turno {

    public void ejecutar(Caballo[] caballos, int limite) {
        for (Caballo c : caballos) {
            c.avanzar(limite);
        }
    }
}