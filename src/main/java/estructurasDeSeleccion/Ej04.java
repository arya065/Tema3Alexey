package estructurasDeSeleccion;
import java.util.*;

public class Ej04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad:");

        int edad = scanner.nextInt();

        String result= (edad>=18)? "Es mayor de edad":"No es mayor de edad";
        
        System.out.print("mostrar la edad: ");
        System.out.println(result);
    }

}