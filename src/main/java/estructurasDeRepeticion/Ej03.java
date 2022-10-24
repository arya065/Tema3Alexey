package estructurasDeRepeticion;
import java.util.*;

public class Ej03 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        int x;
        x=15;
        for (int i=1;i<=25;i++) {
            System.out.print(x);
            System.out.print(" - ");
            x *= 2;
        }
    }
}

