package pspRepaso1ev;

import pspRepaso1ev.Vista.VistaInput;
import pspRepaso1ev.Vista.VistaOutput;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        VistaOutput.mostrarMensaje("REPASO PSYP 1 Ev:\n");
        //serviceLogger.startLogger();
        //serviceLogger.getLogger().info("FlightsApp started successfully");
        String opcion = "";
        int opcionNumero = -5;
        //serviceValidator.menuOption(option.toLowerCase());
        //int optionArg = args[optionNumber];

        while (opcionNumero !=0) {
            opcion = VistaInput.inputMenu();
            //opcionNumero = serviceValidator.menuOption(option.toLowerCase());
            switch (opcionNumero) {
                case 1:
                    VistaOutput.mostrarMensaje(VistaOutput.menu);
                    break;

                default:
                    break;
            }
        }
        VistaOutput.mostrarMensaje("===== FIN DEL PROGRAMA =====");
        //serviceLogger.getLogger().info("Fin del programa");

    }
}
