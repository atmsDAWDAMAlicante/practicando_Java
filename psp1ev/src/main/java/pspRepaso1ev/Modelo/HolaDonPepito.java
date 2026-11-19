package pspRepaso1ev.Modelo;

import pspRepaso1ev.Vista.VistaOutput;

// IO READER
import java.io.*;

// PROPERTIES
import java.util.Properties;

public class HolaDonPepito {
    public static void cogerRuta() throws FileNotFoundException{
        //BufferedReader br = null;
        final String rutaDonPepito; // sin inicializar para poder usarla en Runnable o lambda
        final String rutaLaYenca;

        // 1 - Lectura de las propiedades: rutaDonPepito
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("src/main/resources/config.properties")) {
            properties.load(input);
        } catch (IOException e){
            VistaOutput.mostrarError("Lectura de propiedades", e);
        }
        rutaDonPepito = properties.getProperty("path.textoHolaDonPepito");
        rutaLaYenca = properties.getProperty("path.textoLaYenca");


        // 2 - Hilo - Don Pepito
        Runnable DonPepito = new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("CANCIÓN: Hola Don Pepito");
                VistaOutput.mostrarMensaje(Thread.currentThread().getName());
                try (BufferedReader br = new BufferedReader(new FileReader(rutaDonPepito))) {
                    String cadena = "";
                    int contador = 0;
                    while ((cadena = br.readLine()) != null) {
                        if (cadena.contains("Don Pepito") || cadena.contains("usted")) {
                            VistaOutput.mostrarMensaje("DON JOSÉ: " + cadena);
                        } else {
                            VistaOutput.mostrarMensaje("DON PEPITO: " + cadena);
                        }
                    Thread.sleep(1000);
                    }
                } catch (IOException | InterruptedException e) {
                    VistaOutput.mostrarError("cogerRuta", e);
                }
            }
        };
        Thread LaYenca = new Thread (()->{
            Thread.currentThread().setName("CANCIÓN: La Yenca");
            VistaOutput.mostrarMensaje(Thread.currentThread().getName());
        try (BufferedReader br = new BufferedReader(new FileReader(rutaLaYenca))){
            String cadena = "";
            while ((cadena = br.readLine()) != null){
                VistaOutput.mostrarMensaje(cadena);
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            VistaOutput.mostrarError("La Yenca", e);
        }
        });


        LaYenca.start();
        DonPepito.run();


    }
}
