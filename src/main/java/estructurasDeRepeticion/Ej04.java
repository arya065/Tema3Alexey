package estructurasDeRepeticion;

public class Ej04 {

    public static void main(String[] args) {

        int numero = 1;
        while (numero < 11) {
            System.out.println("Numero: " + numero);
            numero++;
        }
        do {
            System.out.println("Numero: " + --numero);
        } while (numero > 1);
    }
}
/*se imprime
Numero:1
Numero:2
.
.
Numero:10
Numero:10
Numero:9
.
.
Numero:1
*/