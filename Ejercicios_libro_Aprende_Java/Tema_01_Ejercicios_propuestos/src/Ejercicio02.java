import org.w3c.dom.ls.LSOutput;



/* Enunciado:
1.2. Escribir un programa que tome como entrada un número entero y nos indique qué
cantidad hay que sumarle para que el resultado sea múltiplo de 7. Un ejemplo:
- A 2 hay que sumarle 5 para que el resultado (2 + 5 = 7) sea múltiplo de 7.
- A 13 hay que sumarle 1 para que el resultado (13 + 1 = 14) sea múltiplo de 7.

Si proporcionamos el número 2 o el 13, la salida de la aplicación debe ser 5 o 1, respectivamente.
*/
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        float numero = sc.nextInt();
        float resto = numero % 7;
        float resultado = 7 - resto;
        System.out.println("Número = " + numero + "\nResto = " + resto + "\nResultado (7 - resto) = " + resultado);
        sc.close();
    }
}
