package pspRepaso1ev.Modelo;
import pspRepaso1ev.Vista.VistaOutput;
import java.util.List;
import java.util.ArrayList;

public class CafeyTostadas {
    public static void creacionHilos(){
        // SI ESTÁ EL TRY NO HACE FALTA EL TRHOWS
        // Primero las tostadas en clase aparte
        //prepararTostadas();
        //Tostadora t = new Tostadora();
        //Thread t = new Thread(new Tostadora());

        // CLASE ABSTRACTA
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.currentThread().setName("Tostadas");
                    Thread yo = Thread.currentThread();
                    yo.setName("Tostadora");
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
        };

        // LAMBDA
        Thread t = new Thread(r);
        t.start();
        Thread tContador = new Thread(()->{
            try{
                Thread.currentThread().setName("Contador");
                for (Integer i = 0; i <10; i++){
                    VistaOutput.mostrarMensaje(i.toString());
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e){
                VistaOutput.mostrarError("main", e);
            }
        });
        tContador.start();

        // NORMAL
        try{
            // Segundo el cafe
            prepararCafe();
        } catch (InterruptedException e){
            VistaOutput.mostrarError("main", e);
        }

        try {
            t.join();
            VistaOutput.mostrarMensaje("Hilo: " + Thread.currentThread().getName() + " esta " + Thread.currentThread().getState());
            tContador.join();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // ESTO SUCEDE DESPUÉS DE JOIN
        List<Thread> hilos = new ArrayList<>(List.of(t,tContador));
        // Está mal este casting VistaOutput.mostrarArray((Element)hilos);
        VistaOutput.mostrarArray(hilos);

        VistaOutput.mostrarMensaje("Hilo: " + tContador.getName() + " esta " + Thread.currentThread().getState());



        /*while (!t.isAlive() && !tContador.isAlive()) {
            for (Thread hilo : hilos) {
                VistaOutput.mostrarMensaje(hilo.getId() + " / " + hilo.getName() + " / " + hilo.getPriority() + " / " + hilo.getState());
            }
        }*/

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

class Contador{
    public static void contar(){
        for (Integer i = 0; i <10; i++){
            VistaOutput.mostrarMensaje(i.toString());
        }
    }
}