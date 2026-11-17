package pspRepaso1ev;

import pspRepaso1ev.Vista.VistaInput;
import pspRepaso1ev.Vista.VistaOutput;
import pspRepaso1ev.Servicios.serviceValidator;
import pspRepaso1ev.Modelo.CafeyTostadas;

public class Main {

    public static void main(String[] args) {
        VistaOutput.mostrarMensaje("REPASO PSYP 1 Ev:\n");
        //serviceLogger.startLogger();
        //serviceLogger.getLogger().info("FlightsApp started successfully");
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
                case 0:
                    break;
                default:
                    break;
            }
        }
        VistaOutput.mostrarMensaje("===== FIN DEL PROGRAMA =====");
        //serviceLogger.getLogger().info("Fin del programa");

    }
}
