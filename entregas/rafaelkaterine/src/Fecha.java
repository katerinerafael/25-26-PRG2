package vistas;

class Fecha {
    public Fecha(int dia, int mes, int año)
    public Fecha()
    public Fecha(Fecha fecha)

    
    public void editar(int dia, int mes, int año)
    public void mostrar()

    public boolean esPosterior(Fecha fecha)
    public boolean esPosterior(int dia, int mes, int año)
    public boolean finDeSemana()
    public boolean esBisiesto()
    public boolean tiene30Dias()

    public int diasTranscurridos(Fecha fecha)
    public int diasTranscurridos(int dia, int mes, int año)

    public Fecha[] calendarizar(Fecha fecha, int frecuenciaEnDias)    
    public Fecha[] calendarizar(Fecha fecha, int frecuencia, int cantidadDeFechas)    
}