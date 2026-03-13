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
        return new Intervalo(this);
    }

    public double longitud() {
        return this.longitud;
    }

    public void desplazar(double desplazamiento) {
        this.puntoMedio = this.puntoMedio + desplazamiento;
    }

    public Intervalo desplazado(double desplazamiento) {
        Intervalo intervalo = this.clone();
        intervalo.desplazar(desplazamiento);
        return intervalo;
    }

    public boolean incluye(double punto) {
        return punto >= this.inferior && punto <= this.superior;
    }

    public boolean incluye(Intervalo intervalo) {
    }

    public boolean equals(Intervalo intervalo) {
        return this.puntoMedio == intervalo.puntoMedio && this.longitud == intervalo.longitud;
    }

    public Intervalo interseccion(Intervalo intervalo) {

    }
    
    public boolean intersecta(Intervalo intervalo) {
    }
    
    public void oponer() {
        this.puntoMedio = -this.puntoMedio;
    }

    public void doblar() {
        this.longitud *= 2;
    }


    public void mostrar() {
        double inferior = this.puntoMedio - this.longitud / 2;
        double superior = this.puntoMedio + this.longitud / 2;
        console.writeln("[" + inferior + ", " + superior + "]");
    }

    public void recoger() {
    }

    public Intervalo[] trocear(int numeroTrozos) {
        Intervalo[] trozos = new Intervalo[numeroTrozos];
        double nuevaLongitud = this.longitud / numeroTrozos;
        double inicio = this.puntoMedio - this.longitud / 2;
        for (int i = 0; i < numeroTrozos; i++) {
            trozos[i] = new Intervalo(inicio + i * nuevaLongitud, inicio + (i + 1) * nuevaLongitud);
        }
        return trozos;

    }
    
    public Intervalo union(Intervalo intervalo) {

    }
    
    public double puntoMedio() {

    };


}