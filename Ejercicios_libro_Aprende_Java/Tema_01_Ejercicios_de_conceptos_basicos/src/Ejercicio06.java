

/* Enunciado:
1.6. Modificar el ejercicio anterior para que muestre la parte entera
de la media de tres notas decimales.
*/

public class Ejercicio06 {
    public static void main(String[] args) {
        int nota1 = 10;
        int nota2 = 5;
        int media = (nota1 + nota2) / 2; // elimina los decimales al ser enteros
        System.out.println("La media es: " + media);

    }
}
