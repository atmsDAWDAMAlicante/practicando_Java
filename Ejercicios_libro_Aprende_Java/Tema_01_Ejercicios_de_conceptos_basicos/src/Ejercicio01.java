import java.util.Scanner;

/* Enunciado
1.1. Diseñar un programa que pida un número al usuario —por teclado—
y, a continuación, lo muestre.
 */

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");

        int numero = sc.nextInt();

        System.out.println("El número introducido es " + numero);
    }



}
