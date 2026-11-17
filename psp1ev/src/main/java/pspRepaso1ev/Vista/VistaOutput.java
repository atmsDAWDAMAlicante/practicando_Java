package pspRepaso1ev.Vista;
import java.util.List;
import java.util.ArrayList;
import javax.lang.model.element.Element;

public class VistaOutput {

    public static String menu = "MENU: m: Menu // -cre: Crear Hilos // tie: AEMET // -s: salir";

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public static void mostrarError(String mensaje, Exception e) {
        System.out.println("METODO: " + mensaje + "--" + e.toString());
    }

    public static void mostrarArray(List<?> array)
    {
        for (Object e: array){
            VistaOutput.mostrarMensaje(e.toString());
        }
    }


}
