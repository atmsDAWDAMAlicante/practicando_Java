import java.util.Arrays;

/* Enunciado: VARIACIÓN - LOS NÚMEROS SERÁN ALEATORIOS
5.3. Introducir por teclado un número n;
a continuación solicitar al usuario que teclee n números.
Realizar la media de los números positivos,
la media de los negativos y contar el número de ceros introducidos.
*/

public class Ejercicio03Tablas {
    public static void main(String[] args) {
        int numeros = 0;
        int[] array = new int[10];
        String resultado = "";

        // Relleno de números aleatorios
        for (int i = 0; i < 10; i++){
            int num = (int)((Math.random())*2);
            if (num == 0){
                array[i]= ((int)((Math.random())*10)*-1);
            } else {
                array[i]= (int)((Math.random())*10);
            }

        }
        System.out.println(Arrays.toString(array));
        // Bucle que obtiene el resultado
        int[] contadores = new int[3]; // 0 para el 0, 1 positivos, 2 negativos
        double[] sumaMedias = new double[2]; // 0 para positivos, 1 negativos
        double[] resultadoMedias = new double[2]; // 0 para positivos, 1 negativos

        // Recuentos y sumas en un bucle foreach
        for (int elemento: array){
            if (elemento == 0){
                contadores[0]++;
            } else if (elemento > 0) {
                contadores[1]++;
                sumaMedias[0] += elemento;
            } else {
                contadores[2]++;
                sumaMedias[1] += elemento;
            }
        }

        // Impresión de los recuentos
        System.out.println("Recuento-- 0: " + contadores[0] + " / Pos: " + contadores[1] + " / Neg: " + contadores[2]);
        System.out.println("Sumas: Pos: " + sumaMedias[0] + " / Neg: " + sumaMedias[1]);

        // Cálculo de las medias dentro de un bloque try-catch División x 0
        try{
            resultadoMedias[0] = sumaMedias[0] / contadores[1];
            resultadoMedias[1] = sumaMedias[1] / contadores[2];
            System.out.println("Medias: Pos: " + resultadoMedias[0] + " / Neg: " + resultadoMedias[1]);
        } catch (Exception e){
            System.out.println("Positivos o negativos: uno de los dos tiene 0 elementos" + e);
        }

        System.out.println("Fin del programa");
    }
}
