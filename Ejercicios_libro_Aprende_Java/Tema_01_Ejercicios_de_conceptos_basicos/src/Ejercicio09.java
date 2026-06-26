

/* Enunciado:
1.9. Los precios de la fruta no suelen ser constantes; varían según el mercado.
Se pide modificar el ejercicio anterior para que los precios no estén fijados
y sea la aplicación quien los pida al usuario.
*/


import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables
        float precioKiloManzanas = 0f;
        float precioKiloPeras = 0;
        float importeMensualManzanas;
        float importeMensualPeras;
        float importeTotalManzanas = 0f;
        float importeTotalPeras = 0f;
        String desgloseManzanas = "";
        String desglosePeras = "";

        // Entradas por trimestres (si bucles)

        // 1º Trimestre
        System.out.println("Introduce el precio del kilo de manzanas durante el 1º trimestre: ");
        precioKiloManzanas = sc.nextFloat();
        System.out.println("Introduce el precio del kilo de peras durante el 1º trimestre: ");
        precioKiloPeras = sc.nextFloat();
        System.out.println("Introduce los kilos de manzanas vendidas el 1º trimestre: ");
        int kilosManzanas = sc.nextInt();
        importeMensualManzanas = precioKiloManzanas * kilosManzanas;
        System.out.println("Introduce los kilos de peras vendidas el 1º trimestre: ");
        int kilosPeras = sc.nextInt();
        importeMensualPeras = precioKiloPeras * kilosPeras;

        desgloseManzanas = "Manzanas-1º Trimestre: " + kilosManzanas + " kg a " + precioKiloManzanas + " € el kg = " + importeMensualManzanas + " €\n";
        desglosePeras = "Peras-1º Trimestre: " + kilosPeras + " kg a " + precioKiloPeras + " € el kg = " + importeMensualPeras + " €\n";
        importeTotalManzanas += importeMensualManzanas;
        importeTotalPeras += importeMensualPeras;

        // 2º Trimestre
        System.out.println("Introduce el precio del kilo de manzanas durante el 2º trimestre: ");
        precioKiloManzanas = sc.nextFloat();
        System.out.println("Introduce el precio del kilo de peras durante el 2º trimestre: ");
        precioKiloPeras = sc.nextFloat();
        System.out.println("Introduce los kilos de manzanas vendidas el 2º trimestre: ");
        kilosManzanas = sc.nextInt();
        importeMensualManzanas = precioKiloManzanas * kilosManzanas;
        System.out.println("Introduce los kilos de peras vendidas el 2º trimestre: ");
        kilosPeras = sc.nextInt();
        importeMensualPeras = precioKiloPeras * kilosPeras;
        System.out.println(importeMensualPeras);
        desgloseManzanas += "Manzanas-2º Trimestre: " + kilosManzanas + " kg a " + precioKiloManzanas + " € el kg = " + importeMensualManzanas + " €\n";
        desglosePeras += "Peras-2º Trimestre: " + kilosPeras + " kg a " + precioKiloPeras + " € el kg = " + importeMensualPeras + " €\n";
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
