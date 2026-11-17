package pspRepaso1ev.Servicios;

public class serviceValidator {

    public static int validarOpcion(String opcion) {

        if (opcion.contains("-m")) {
            return 1;
        } else if ((opcion.contains("-cre")) || (opcion.contains("-crea"))){
            return 2;
        } else if ((opcion.contains("-tie")) || (opcion.contains("-tiem"))){
            return 3;
        } else if ((opcion.contains("-s")) || (opcion.contains("-salir"))){
            return 0;
        } else {
            return 0;
        }
    }
}
