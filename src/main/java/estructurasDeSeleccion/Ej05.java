package estructurasDeSeleccion;
import java.util.*;

public class Ej05 { 	
    	 public static void main(String[] args) {
          int numero = 1;
         
          while (numero < 11)
          {
               System.out.println("Número: " + numero);
               numero++;
          }
          do {
               System.out.println("Número: " + --numero);
          } while(numero > 1);
   	  }
	}

