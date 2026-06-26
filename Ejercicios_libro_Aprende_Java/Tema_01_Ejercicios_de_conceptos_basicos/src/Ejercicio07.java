
import java.lang.Math;
import java.util.Scanner;
/* Enunciado:
1.7 Sería interesante disponer de un programa que pida como entrada un número decimal
y lo muestre redondeado al entero más próximo.
*/

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número con decimales: ");
        float numero = sc.nextFloat();
        //int entero = (int)numero;
        int entero = Math.round(numero);
        System.out.println("El numero entero: " + entero);
    }
}
