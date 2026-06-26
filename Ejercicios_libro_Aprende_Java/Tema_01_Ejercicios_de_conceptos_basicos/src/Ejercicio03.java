import java.util.Scanner;
import java.time.LocalDate; // Date.getYear() deprecado

/* Enunciado:
1.3. Escribir una aplicación que pida el año actual y el de nacimiento del usuario.
Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido años.
*/

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate fecha = LocalDate.now(); // SIN NEW -- RECOGE LA FECHA
        // LocalDate fechaEspecifica = LocalDate.of(2026, 3, 15); // También es un método estático
        int ano = fecha.getYear(); // Saca el año de la fecha
        System.out.println("Introduce tu año de nacimiento: \n");
        int nacimiento = sc.nextInt();
        System.out.println("Tienes " + (ano - nacimiento) + " años");
    }

}
