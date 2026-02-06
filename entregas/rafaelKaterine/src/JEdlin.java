import java.util.Scanner;
import java.util.Arrays;

public class JEdlin {
    private String[] lines;
    private int activateLine;
    private Scanner scanner;

    public JEdlin() {
        lines = new String[10];
        Arrays.fill(lines,"");
        lines[0] = "Bienvenidos al editor EDLIN";
        lines[1]= "Utilice el menu inferior para editar el texto";
        lines[2]= "---------------------------------------------";
        activateLine = 0;
        scanner = new Scanner(System.in)
    }

    private void clearScreen(){
        System.out.print("/////////");
        System.out.flush();
        for (int i = 0; i < 50; i++) System.out.println();
    }

    
}


