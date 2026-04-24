class Caballo{
    private final String alias;
    private int posicion = 0;
        
    public Caballo(String alias) {
        this.alias = alias;
    }

    public void avanzar() {
        int avance = new Random().nextInt(3);
        this.posicion += avance;
       if (this.posicion > limiteDeCarrera) this.posicion = limiteDeCarrera;
        }

    public void mostrar(){
        for (int i = 0; i < this.posicion; i++) {
        System.out.print(" ");
        }
        System.out.println(";-;' (" + this.alias + ")");
    }
}
    
