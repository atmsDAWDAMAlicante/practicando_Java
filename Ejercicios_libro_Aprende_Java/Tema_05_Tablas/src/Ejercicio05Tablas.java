import java.util.Scanner;
import java.util.Arrays;

/* Enunciado: VARIACIÓN - LA CLAVE SERÁ ALEATORIA
5.5. Desarrollar el juego la cámara secreta, que consiste abrir
una cámara mediante su combinación secreta,
que está formado por una combinación de dígitos del uno al cinco.
El jugador especificará cuál es la longitud de la combinación,
a mayor longitud mayor será la dificultad del juego.
La aplicación genera, de forma aleatoria, una combinación secreta
que el usuario tendrá que acertar. En cada intento se muestra como pista,
para cada dígito de la combinación introducido por el jugador,
si es mayor, menor o igual que el correspondiente en la combinación secreta.
*/

public class Ejercicio05Tablas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("::La Camara Secreta::");

        // Variables de la clave
        int []clave = new int[4];
        String [] pistas = new String[4];

        // Variables de la clave del usuario
        int claveUsuario; // no es necesario inicializarla
        int[] claveUsuarioArray = new int[4];
        int codigoControl; // no es necesario inicializarla

        // El programa genera la clave secreta
        rellenarClaveSecreta(clave);

        // Usuario rellena su clave secreta
        System.out.println("Introduzca la clave secreta");
        claveUsuario = sc.nextInt();

        // Validaciones
        codigoControl = obtenerCodigoControl(claveUsuario);

        // Relleno Array clave usuario
        rellenarClaveUsuario(claveUsuario, codigoControl, claveUsuarioArray, sc);

        System.out.println("Clave aleatoria: " + Arrays.toString(clave));
        System.out.println("Clave pistas: " + Arrays.toString(pistas));
        System.out.println("Codigo control: " + codigoControl);
        System.out.println("Clave usuario: " + Arrays.toString(claveUsuarioArray));
        System.out.println("Clave pistas: " + Arrays.toString(pistas));
        System.out.println("Fin del programa");
    }


    public static int obtenerCodigoControl(int claveUsuario){
        // claveUsuario = (int)(claveUsuario); NO ES NECESARIO
        // no es necesario el casting porque ya está definida arriba como int
        if (claveUsuario < 10)
            return 3;
        else if (claveUsuario < 100)
            return 2;
        else if (claveUsuario < 1000)
            return 1;
        else
            return 0;
    }

    public static void rellenarClaveUsuario(int claveUsuario, int codigoControl, int[] claveUsuarioArray, Scanner sc){

        for (int i = 0; i < codigoControl; i++){
            claveUsuarioArray[i] = 0;
        }
        //parte que falla

        String claveString = Integer.toString(claveUsuario);
        int longitudClaveString = claveString.length() - 1;
        int resta = longitudClaveString - codigoControl ;
        System.out.println("resta: "+ resta + "\nclave usuario" +  claveUsuario+"\nclave string: " + claveString + "\nlongitud clave string: " + longitudClaveString);
        System.out.println((claveString.length()) + "-" + (longitudClaveString));
        for (int j = longitudClaveString; j < resta; j++){
            claveUsuarioArray[j] = claveString.charAt(j);
            System.out.println("numero a numero: " + claveUsuarioArray[j]);
        }
    }

    public static void rellenarClaveSecreta(int[] clave){
        // Bucle para rellenar la clave secreta
        for (int i = 0; i < clave.length; i++){
            clave[i] = ((int)((Math.random())*10));
        }
    }
}
