package estructurasDeSeleccion;

import java.util.*;

public class Ej02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String result,resultDe0;
        System.out.print("Introduce numero X:");

        double numeroX = scanner.nextDouble();

        result= (numeroX>=135)? "mayor":"menor";
        //System.out.println(result);
        
        resultDe0= (numeroX>0)? "Mayor que cero":"Menor que cero";
        //System.out.println(resultDe0);
        
        System.out.println("Introduce numero entero");
        int numeroEntero= scanner.nextInt();
        int valorAbsoluto;
        
        valorAbsoluto= (numeroEntero>0)? numeroEntero: (numeroEntero<0)? numeroEntero*-1:0;
    }

}
