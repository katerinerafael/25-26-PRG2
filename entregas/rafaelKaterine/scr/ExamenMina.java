import java.util.Scanner;
public class ExamenMina{

    static String[][] tablero = new String[6][8];
        
    static String[][] ubicacionMinas = new String[6][8];


    public static void main(String[] args){    

        inicializarTablero();

        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i < 5){
            int minaPosicionColumna = (int)(Math.random()*2+1);
            int minaPosicionFila = (int)(Math.random()*4+1);
            if (ubicacionMinas[minaPosicionFila][minaPosicionColumna]=="1"){
                i = i - 1;
            }
            else {
                ubicacionMinas[minaPosicionFila+1][minaPosicionColumna+1]="1";
            }
            i++;
        }

        int posicionFila=0, posicionColumna=0, juegoEncendido=1, posicionActual, contadorMomientos=0, contadorMinas=0;

        while(juegoEncendido==1){

            for(i = 0; i < tablero.length; i++){            
                for (int j = 0; j < tablero[i].length; j++) {                                     
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            posicionActual=0;
            while(posicionActual==0){
                System.out.println(" ");
                System.out.println("Ingrese X");
                posicionColumna = scanner.nextInt();
                System.out.println("Ingrese Y");
                posicionFila = scanner.nextInt();

                if(posicionFila>5){
                    posicionActual=0;
                }
                else if(posicionColumna>7){
                    posicionActual=0;
                }
                else{
                    posicionActual=1;
                }
            }

            if(ubicacionMinas[posicionFila][posicionColumna]=="1"){
                tablero[posicionFila][posicionColumna]="x";
                contadorMinas++;
            }
            else if(ubicacionMinas[posicionFila][posicionColumna]=="0"){
                tablero[posicionFila][posicionColumna]=".";
            }
            else{
                System.out.println("No es correcta esa opcion.");
            }

            contadorMomientos++;
            if(contadorMinas>2){
                juegoEncendido=0;
                System.out.println("Has perdido");
            }
            else if(contadorMomientos>=31){
                System.out.println("Felicidades Ganador!");
                juegoEncendido=0;
            }
        }
    }
    public static void inicializarTablero() {

        tablero[0][0] = " ";

        for (int j = 1; j < 8; j++) {
            tablero[0][j] = String.valueOf(j);
        }

        for (int i = 1; i < 6; i++) {
            tablero[i][0] = String.valueOf(i);
            for (int j = 1; j < 8; j++) {
                tablero[i][j] = "-";
            }
        }
    }
		public static void inicializarMinas() {

		ubicacionMinas[0][0] = " ";

		// Encabezado columnas
		for (int j = 1; j < 8; j++) {
			ubicacionMinas[0][j] = String.valueOf(j);
		}

		// Filas con 0
		for (int i = 1; i < 6; i++) {
			ubicacionMinas[i][0] = String.valueOf(i);
			for (int j = 1; j < 8; j++) {
				ubicacionMinas[i][j] = "0";
			}
		}
	}

}
