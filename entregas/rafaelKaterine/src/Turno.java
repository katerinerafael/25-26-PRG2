public class Turno {

    public void ejecutar(Caballo[] caballos, int limite) {
        for (Caballo caballo : caballos) {
            caballo.avanzar(limite);
        }
    }
}