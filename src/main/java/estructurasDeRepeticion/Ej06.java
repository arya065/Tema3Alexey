package estructurasDeRepeticion;
import java.util.* ;
public class Ej06 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
        
        for(x=1;x<=n;x++){
            System.out.print(x);
            System.out.print(" - ");
        }
    }
}
