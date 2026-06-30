import java.util.Scanner;

/* Enunciado:
1.1. Un economista nos ha encargado un programa para realizar cálculos con el IVA.
La aplicación debe solicitar la base imponible y el IVA a aplicar.
Debemos mostrar en pantalla el importe correspondiente al IVA y el total.
*/

public class Ejercicio01 {
    public static void main(String[] args) {
        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println("Introduce tipo del IVA");
        double iva = sc.nextDouble();

        // Cálculo
        double importeIVA = precio * (iva * 0.01);
        double precioConIva = precio + importeIVA;
        System.out.println("Precio sin IVA: " + precio + " € + IVA " + iva + "%\n" +
                "TOTAL: " + precioConIva);
    }

}
