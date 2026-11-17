package pspRepaso1ev.Vista;

public class VistaOutput {

    public static String menu = "MENU: m: Menu // -s: salir";

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public static void mostrarError(String mensaje, Exception e) {
        System.out.println("METODO: " + mensaje + "--" + e.toString());
    }

    public static void mostrarMenu(String menu) {
        mostrarMensaje(menu);
    }


}
