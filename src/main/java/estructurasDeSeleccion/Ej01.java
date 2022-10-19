package estructurasDeSeleccion;
import java.util.*;

public class Ej01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad:");

        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.print("mostrar la edad: ");
        System.out.println(edad);
    }

}
// 15- No es mayor de edad
//mostrar la edad: 15

// 18- Es mayor de edad
//mostrar la edad: 18

// 60- Es mayor de edad
//mostrar la edad: 60