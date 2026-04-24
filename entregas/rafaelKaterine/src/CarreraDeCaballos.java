class CarreraDeCaballos {

    private Caballo[] caballos;
    private Pista pista;
    private Turno turnos;

    public CarreraDeCaballos() {
        pista = new Pista(40);
        turnos = new Turno(); 
        caballos = new Caballo[4]; 
        caballos[0] = new Caballo("Rayo");
        caballos[1] = new Caballo("Secretariat");
        caballos[2] = new Caballo("Potooooooo");
        caballos[3] = new Caballo("WinkyWinky");
    }

    public void empezar(){
        boolean carreraTerminada = false;
    
        while (!carreraTerminada) {
            turnos.ejecutar(caballos, pista.limite);
            pista.mostrar(console);
            for (Caballo caballo : caballos) {
                caballo.mostrar(console);
                if (caballo.posicion >= pista.limite) {
                    carreraTerminada = true;
                }
            }
            pista.mostrar(console);
            System.out.println();
        }
        int cantidadDeGanadores = 0;
        for (Caballo caballo : caballos) {
            if (caballo.posicion >= pista.limite) cantidadDeGanadores++;
        }

        if (cantidadDeGanadores > 1) {
            console.writeln("Hubo un empate");
        } else {
            for (Caballo caballo : caballos) {
                if (caballo.posicion >= pista.limite) {
                    console.writeln("El ganador es: " + caballo.alias);
                }
            }
        }

    }
}


