package pspRepaso1ev;

import pspRepaso1ev.Vista.VistaInput;
import pspRepaso1ev.Vista.VistaOutput;
import pspRepaso1ev.Servicios.serviceValidator;
import pspRepaso1ev.Modelo.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.sql.Connection;


public class Main {

    public static void main(String[] args) {
        VistaOutput.mostrarMensaje("REPASO PSYP 1 Ev:\n");
        //serviceLogger.startLogger();
        //serviceLogger.getLogger().info("FlightsApp started successfully");

        // 1. Validar que el usuario haya ingresado al menos un argumento
        if (args.length == 0) {
            VistaOutput.mostrarMensaje("Error: Debes proporcionar una opción (Ej: -m o -crea <archivo>)");
            return;
        }

        // 2. Evaluar el primer argumento (-m o -crea)
        switch (args[0]) {
            case "-m":
            // Llama a la función estática del archivo Menu.java
                VistaOutput.mostrarMensaje(VistaOutput.menu);
                break;

            case "-cre":
                // 3. Validar que exista el segundo parámetro (el nombre del archivo)
                if (args.length < 2) {
                    System.out.println("Error: Falta especificar el nombre del archivo después de -crea");
                } else {
                    String nombreArchivo = args[1];
                    // Llama a la función estática 'crea' pasando el nombre del archivo
                    CafeyTostadas.creacionHilos(args[1]);
                }
                break;

            case "-DonPepito":
                // Llama a Hola Don Pepito
                try {
                        HolaDonPepito.cogerRuta();
                } catch (FileNotFoundException e){
                        VistaOutput.mostrarError("cogerRuta", e);
                    }
                break;

            case "-MusicaDeLos80":
                try {
                    MusicaDeLos80.musica80();
                } catch (Exception e){
                    VistaOutput.mostrarError("Los 80 en el Main", e);
                }
                break;


            case "-SoloConnection":
                try {
                    dbSoloConnection.soloConnection();
                    /*if (conn != null){
                        VistaOutput.mostrarMensaje("MAIN Conexión establecida");
                    } else {
                        VistaOutput.mostrarMensaje("MAIN Conexión nula");
                    }*/
                } catch (Exception e){
                    VistaOutput.mostrarError("MAIN Solo Connection", e);
                }
                break;




                    default:
                        System.out.println("Opción no reconocida: " + args[0]);
                        break;
                }
        VistaOutput.mostrarMensaje("===== FIN DEL PROGRAMA =====");
            }
        }


        /*
        String opcion = "";
        int opcionNumero = -5;
        //int optionArg = args[optionNumber];

        while (opcionNumero !=0) {
            opcion = VistaInput.inputMenu();
            opcionNumero = serviceValidator.validarOpcion(opcion.toLowerCase());

            switch (opcionNumero) {
                case 1:
                    VistaOutput.mostrarMensaje(VistaOutput.menu);
                    break;
                case 2:
                    CafeyTostadas.creacionHilos();
                    break;
                case 3:
                    ElTiempo.main();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }*/

        //serviceLogger.getLogger().info("Fin del programa");

