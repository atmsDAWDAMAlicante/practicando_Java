

/* Enunciado:
1.4. El tipo short permite almacenar valores comprendidos entre -32.768 y 32.767. (punto = miles)
Se pide escribir un programa que compruebe que el rango de valores de un tipo se comporta de forma cíclica,
es decir, el valor siguiente al máximo es el valor mínimo y viceversa.
*/

public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("El tipo short permite almacenar valores comprendidos entre -32.768 y 32.767");
        short numero = 32767;
        System.out.println("Se suma 1 a " + numero);
        numero++;
        System.out.println("Resultado de la suma: " + numero);
        System.out.println("Se resta 1 a " + numero);
        numero--;
        System.out.println("Resultado de la resta: " + numero);
        System.out.println("Es cíclico.");
    }
}
