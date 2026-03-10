class Intervalo{
     private double puntoMedio;
     private double longitud;

     public Intervalo (double inferior, double superior) {
        this.longitud = superior - inferior;
        this.puntoMedio = inferior + this.longitud / 2;

    }

    public Intervalo (double superior) {
        this(0, superior);
    }

    public Intervalo () {
        this(0, 0);
    }
    
    public Intervalo (Intervalo intervalo) {
        this(intervalo.inferior, intervalo.superior);
    }

    public Intervalo clone() {
    }

    public double longitud() {
    }

    public void desplazar(double desplazamiento) {
    }

    public Intervalo desplazado(double desplazamiento) {
    }

    public boolean incluye(double punto) {
    }

    public boolean incluye(Intervalo intervalo) {
    }

    public boolean equals(Intervalo intervalo) {
    }

    public Intervalo interseccion(Intervalo intervalo) {

    }
    
    public boolean intersecta(Intervalo intervalo) {
    }
    
    public void oponer() {
    }

    public void doblar() {
    }


    public void mostrar() {

    }

    public void recoger() {
    }

    public Intervalo[] trocear(int numeroTrozos) {

    }
    
    public Intervalo union(Intervalo intervalo) {

    }
    
    public double puntoMedio() {

    };


}