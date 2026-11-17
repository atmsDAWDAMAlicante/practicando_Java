package pspRepaso1ev.Modelo;
import pspRepaso1ev.Vista.VistaOutput;

public class aCafeTostadas {
    public static void creacionHilos() {
        // SI ESTÁ EL TRY NO HACE FALTA EL TRHOWS
        // Primero las tostadas en clase aparte
        //prepararTostadas();
        //Tostadora t = new Tostadora();
        Thread t = new Thread(new Tostadora());
        t.start();

        try{
            // Segundo el cafe
            prepararCafe();
        } catch (InterruptedException e){
            VistaOutput.mostrarError("main", e);
        }
    }



    public static void prepararCafe() throws InterruptedException{
        VistaOutput.mostrarMensaje("Cafe: preparar cafe");
        Thread.sleep(1000);
        VistaOutput.mostrarMensaje("Cafe: poner cafetera");
        Thread.sleep(1000);
        VistaOutput.mostrarMensaje("Cafe: cafe en la taza");
        Thread.sleep(1000);
        VistaOutput.mostrarMensaje("Cafe: echar leche");
        Thread.sleep(1000);
        VistaOutput.mostrarMensaje("Cafe: OK");
    }

}

//class Tostadora extends Thread {
class Tostadora implements Runnable {
    @Override
    public void run(){
        //public static void prepararTostadas() throws InterruptedException{
        try{
            VistaOutput.mostrarMensaje("Tostadas: preparar tostadas");
            Thread.sleep(1000);
            VistaOutput.mostrarMensaje("Tostadas: Pan a tostar");
            Thread.sleep(1000);
            VistaOutput.mostrarMensaje("Tostadas: preparar tostadas");
            Thread.sleep(1000);
            VistaOutput.mostrarMensaje("Tostadas: Aceite");
            Thread.sleep(1000);
            VistaOutput.mostrarMensaje("Tostadas: Sal");
            Thread.sleep(1000);
            VistaOutput.mostrarMensaje("Tostadas: OK");
        //}
        } catch (InterruptedException e){
            VistaOutput.mostrarError("Tostadas", e);
        }
    }
}
