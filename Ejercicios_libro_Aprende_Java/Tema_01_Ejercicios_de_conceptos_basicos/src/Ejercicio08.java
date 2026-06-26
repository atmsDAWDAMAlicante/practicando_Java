
import java.util.Scanner;

/* Enunciado:
1.8. Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos)
de cada trimestre para cada fruta.
La aplicación mostrará el importe total sabiendo que el precio del kilo de manzanas
está fijado en 2.35 euros y el kilo de peras está fijado en 1.95 euros.
*/

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables
        float KILOMANZANAS = 2.35f;
        float KILOPERAS = 1.95f;
        float importeMensualManzanas = 0f;
        float importeMensualPeras = 0f;
        float importeTotalManzanas = 0f;
        float importeTotalPeras = 0f;
        String desgloseManzanas = "";
        String desglosePeras = "";

        // Entradas por trimestres (si bucles)

        // 1º Trimestre
        System.out.println("Introduce los kilos de manzanas vendidas el 1º trimestre: ");
        int kilosManzanas = sc.nextInt();
        importeMensualManzanas = KILOMANZANAS * kilosManzanas;
        System.out.println("Introduce los kilos de peras vendidas el 1º trimestre: ");
        int kilosPeras = sc.nextInt();
        importeMensualPeras = KILOPERAS * kilosPeras;

        desgloseManzanas = "Manzanas-1º Trimestre: " + kilosManzanas + " kg = " + importeMensualManzanas + " €\n";
        desglosePeras = "Peras-1º Trimestre: " + kilosPeras + " kg = " + importeMensualPeras + " €\n";
        importeTotalManzanas += importeMensualManzanas;
        importeTotalPeras += importeMensualPeras;

        // 2º Trimestre
        System.out.println("Introduce los kilos de manzanas vendidas el 2º trimestre: ");
        kilosManzanas = sc.nextInt();
        importeMensualManzanas = KILOMANZANAS * kilosManzanas;
        System.out.println("Introduce los kilos de peras vendidas el 2º trimestre: ");
        kilosPeras = sc.nextInt();
        importeMensualPeras = KILOPERAS * kilosPeras;
        System.out.println(importeMensualPeras);
        desgloseManzanas += "Manzanas-2º Trimestre: " + kilosManzanas + " kg = " + importeMensualManzanas + " €\n";
        desglosePeras += "Peras-2º Trimestre: " + kilosPeras + " kg = " + importeMensualPeras + " €\n";
        importeTotalManzanas += importeMensualManzanas;
        importeTotalPeras += importeMensualPeras;

        // Los otros dos trimestres: CERRADO POR VACACIONES ;)

        // Resultados
        System.out.println(desgloseManzanas);
        System.out.println(desglosePeras);
        System.out.println("Beneficio anual por la venta de las manzanas: " + importeTotalManzanas + " €");
        System.out.println("Beneficio anual por la venta de las peras: " + importeTotalPeras + " €");
    }
}
