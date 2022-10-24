package estructurasDeRepeticion;
import java.util.*;

public class Ej02 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
        while (x<=n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
    }
}
//se imprime 1-2-...- hasta numero que ponemos en consola 