import java.util.Scanner;

/* Enunciado:
1.10. Diseñar una aplicación que calcule la longitud y el área de una circunferencia.
Para ello, el usuario debe introducir el radio (que puede contener decimales).
Recordamos:
longitud = 2PI * radio
área = PI * radio2 (cuadrado)
*/

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double longitud, area;
        System.out.println("Area y longitud de la circunferencia.\n");
        System.out.println("Introduce el radio: ");
        double radio = sc.nextFloat();
        longitud = (2 * Math.PI * radio);
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área de la circunferencia es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);


        //Para una circunferencia con un radio de 2,5 cm,
        // su área es de aproximadamente 19,63 cm^2.
        // y su longitud es de aproximadamente 15,71 cm

        sc.close();

    }
}
