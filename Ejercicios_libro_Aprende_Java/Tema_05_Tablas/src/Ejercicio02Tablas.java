import java.util.Arrays;

/* Enunciado: VARIACIÓN - LOS NÚMEROS SERÁN ALEATORIOS
5.2. Escribir una aplicación que solicite al usuario
cuántos números desea introducir. A continuación,
se introducirá por teclado esa cantidad de números enteros,
y por último, los mostrará en el orden inverso al introducido.
*/

public class Ejercicio02Tablas {
    public static void main(String[] args) {

        int[] arrayAleatorio = new int[5];
        int[] arrayResultado = new int[5];

        // Primer bucle que rellena el array con números aleatorios
        for (int i = 0; i <= 4; i++){
            arrayAleatorio[i] = (int)(Math.random()*100);
        }

        System.out.println("Array original: " +  Arrays.toString(arrayAleatorio));

        Arrays.sort(arrayAleatorio); // Ordena el array
        System.out.println("Array ordenado: " +  Arrays.toString(arrayAleatorio));

        // Bucle que recorre en orden inverso el array y lo almacena en otro
        for (int j = 4; j >= 0; j--){
            arrayResultado[4-j] = arrayAleatorio[j];
        }
        System.out.println("Array invertido: " +  Arrays.toString(arrayResultado));
    }
}
