Import java.util.Scanner;


class Intervalo{
     private double puntoMedio;
     private double longitud;

     public Intervalo (double inferior, double superior) {
        assert inferior <= superior;
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
        double inferior = this.puntoMedio - this.longitud / 2;
        double superior = this.puntoMedio + this.longitud / 2;
        
        return punto >= inferior && punto <= superior;
    }

    public boolean incluye(Intervalo intervalo) {
        double inferior = this.puntoMedio - this.longitud / 2;
        double superior = this.puntoMedio + this.longitud / 2;
        
        double otroInferior = intervalo.puntoMedioPrimera - intervalo.longitud / 2;
        double otroSuperior = intervalo.puntoMedio + intervalo.longitud / 2;
        
        return inferior <= otroInferior && superior >= otroSuperior;
    }

    public boolean equals(Intervalo intervalo) {
        return this.puntoMedio == intervalo.puntoMedio && this.longitud == intervalo.longitud;
    }

    public Intervalo interseccion(Intervalo intervalo) {

    }
    
    public boolean intersecta(Intervalo intervalo) {
        double inferior = this.puntoMedio - this.longitud / 2;
        double superior = this.puntoMedio + this.longitud / 2;
        
        double otroInferior = intervalo.puntoMedio - intervalo.longitud / 2;
        double otroSuperior = intervalo.puntoMedio + intervalo.longitud / 2;

        return superior >= otroInferior && otroSuperior >= inferior;
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

    public Intervalo[] trocear(int numeroTrozos) {
        Intervalo[] trozos = new Intervalo[numeroTrozos];
        double nuevaLongitud = this.longitud / numeroTrozos;
        double inicio = this.puntoMedio - this.longitud / 2;
        for (int i = 0; i < numeroTrozos; i++) {
            trozos[i] = new Intervalo(inicio + i * nuevaLongitud, inicio + (i + 1) * nuevaLongitud);
        }
        return trozos;

    }

    public void recoger() {
        Scanner Scanner = new Scanner(System.in);
        boolean valido = false;
    }
    
    public double puntoMedio() {
        return this.puntoMedio;
    };


}