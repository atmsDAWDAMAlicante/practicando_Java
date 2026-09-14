import java.util.Scanner;
import java.util.Arrays;

/* Enunciado: VARIACIÓN - LOS NÚMEROS SERÁN ALEATORIOS
5.4. Implementar un programa que inicialice una tabla
con nuestros números favoritos. A continuación, pedir al usuario
el índice de un elemento que será eliminado de la tabla.
Continuaremos eliminando elementos
hasta que el índice introducido sea negativo
o hasta que no existan más elementos que borrar.
Es imprescindible controlar que el índice leído
corresponde a un dato válido.
*/

public class Ejercicio04Tablas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAborrar = 0;
        int[] array = new int[3];
        String resultado = "";

        // Llamada a la función que rellena el array
        rellenar(array, sc);

        // Llamada a la función que borra el array
        borrar(array, sc);

        System.out.println(Arrays.toString(array));
        // Bucle que obtiene el resultado


        System.out.println("Fin del programa");
    }

    // El array se modifica en la función
    public static void rellenar(int[] array, Scanner sc){
        for (int i = 0; i < 3; i++){
            System.out.println("Introduce el num. " + (i+1) + ":");
            array[i] = sc.nextInt();
        }
    }

    // El array se modifica en la función
    public static void borrar(int[] array, Scanner sc){
        int longitudArray = (array.length)-1;
        while(longitudArray > -1){
            int indice = 0;
            System.out.println("Introduce el indice del num. a borrar: ");
            System.out.println(Arrays.toString(array));
            indice = sc.nextInt();
            if (indice > longitudArray){
                System.out.println("El indice introducido excede de la longitud del array.");
            } else {
                array[indice] = array[longitudArray];
                array[longitudArray] = 0;
                longitudArray--;
            }
        }
    }
}
