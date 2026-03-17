public class Cliente {

    public static void main(String[] args) {
        Fraccion fraccion = new Fraccion(1, 2);
        Fraccion fraccion2 = new Fraccion(3, 4);
        fraccion.sumar(fraccion2);
        System.out.println(fraccion);    
    }
}