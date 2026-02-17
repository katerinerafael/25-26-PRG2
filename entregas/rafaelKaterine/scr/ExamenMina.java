import java.util.Scanner;

public class ExamenMina{

	static String[][] tablero = 	
		{ //[0][0]	[0][1]	[0][2]	[0][3]	[0][4]	[0][5]	[0][6]	[0][7]
			{" ",	"1", 	"2", 	"3", 	"4",	"5",	"6", 	"7"},
		  //[1][0]	[1][1]	[1][2]	[1][3]	[1][4]	[1][5]	[1][6]	[1][7]
			{"1", 	"-", 	"-", 	"-", 	"-", 	"-", 	"-",	"-"},
		  //[2][0]	[2][1]	[2][2]	[2][3]	[2][4]	[2][5]	[2][6]	[2][7]
			{"2", 	"-", 	"-",	"-", 	"-", 	"-", 	"-",	"-"},
		  //[3][0]	[3][1]	[3][2]	[3][3]	[3][4]	[3][5]	[3][6]	[3][7]
			{"3", 	"-", 	"-", 	"-",	"-", 	"-", 	"-",	"-"},
		  //[4][0]	[4][1]	[4][2]	[4][3]	[4][4]	[4][5]	[4][6]	[4][7]
			{"4", 	"-", 	"-",	"-", 	"-", 	"-", 	"-",	"-"},
		  //[5][0]	[5][1]	[5][2]	[5][3]	[5][4]	[5][5]	[5][6]	[5][7]
			{"5", 	"-", 	"-",	"-", 	"-", 	"-", 	"-",	"-"}
		};
		
	static String[][] ubicacionMinas = 	
		{ //[0][0]	[0][1]	[0][2]	[0][3]	[0][4]	[0][5]	[0][6]	[0][7]
			{" ",	"1", 	"2", 	"3", 	"4",	"5",	"6", 	"7"},
		  //[1][0]	[1][1]	[1][2]	[1][3]	[1][4]	[1][5]	[1][6]	[1][7]
			{"1", 	"0", 	"0", 	"0", 	"0", 	"0", 	"0",	"0"},
		  //[2][0]	[2][1]	[2][2]	[2][3]	[2][4]	[2][5]	[2][6]	[2][7]
			{"2", 	"0", 	"0",	"0", 	"0", 	"0", 	"0",	"0"},
		  //[3][0]	[3][1]	[3][2]	[3][3]	[3][4]	[3][5]	[3][6]	[3][7]
			{"3", 	"0", 	"0", 	"0",	"0", 	"0", 	"0",	"0"},
		  //[4][0]	[4][1]	[4][2]	[4][3]	[4][4]	[4][5]	[4][6]	[4][7]
			{"4", 	"0", 	"0",	"0", 	"0", 	"0", 	"0",	"0"},
		  //[5][0]	[5][1]	[5][2]	[5][3]	[5][4]	[5][5]	[5][6]	[5][7]
			{"5", 	"0", 	"0",	"0", 	"0", 	"0", 	"0",	"0"}
		};

	//Posiciones Random de la mina
	public static void main(String[] args){	
	Scanner scanner = new Scanner(System.in);
		///////////////////////////
		int i=0;	
		while ( i < 5){
			int minaPosicionColumna = (int)(Math.random()*2+1);
			int minaPosicionFila = (int)(Math.random()*4+1);
			if (ubicacionMinas[minaPosicionFila][minaPosicionColumna]=="1"){
			i=i-1;
			}
			else {
				ubicacionMinas[minaPosicionFila+1][minaPosicionColumna+1]="1";
			}
			i++;
		}
	
		int posicionFila=0, posicionColumna=0, juegoEncendido=1, posicionActual, contadorMomientosmientos=0, contadorMinas=0;
		/////////////Comienza el juego
		while(juegoEncendido==1){
			for( i = 0; i<tablero.length; i++){            
				for (int j = 0; j<=tablero.length+1; j++) {                                     
					System.out.print(tablero[i][j]);
				}
				System.out.println(" ");
			}
			posicionActual=0;//reseteo de la variable
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
			else{
				
			}
		}
	}	
		
		
}    