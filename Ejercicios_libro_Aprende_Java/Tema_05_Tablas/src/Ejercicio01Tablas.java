import java.util.*;

/* Enunciado:
5.1. Diseñar un programa que solicite al usuario
que introduzca por teclado 5 números decimales a continuación,
debe mostrar los números en el mismo orden que se han introducido.
*/

public class Ejercicio01Tablas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // El enunciado pide números decimales
        List<Double> lista = new ArrayList<Double>();
        double num = 0;

        // Bucle para rellenar el ArrayList
        for (int i = 1;i<6;i++){
            System.out.println("Introduce numero n. " + i + ":");
            num = sc.nextFloat();
            lista.add(num);
        }

        // Bucle para recorrer el ArrayList e imprimir los números
        for (double elemento:lista){
            System.out.println(elemento);
        }
    }
}
