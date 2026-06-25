import java.util.Scanner;

/* Enunciado:
1.2. Pedir al usuario su edad y mostrar la que tendrá el próximo año.
*/

public class Ejercicio02 {
    public static void main(String[] args) {
        // Crear scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su edad: ");

        int edad = (int) sc.nextInt();

        System.out.println("El año que viene tendrás " + (edad+1) + " años.");

    }

}
