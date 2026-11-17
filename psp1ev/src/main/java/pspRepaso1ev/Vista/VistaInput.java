package pspRepaso1ev.Vista;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class VistaInput {

        static Scanner sc = new Scanner(System.in);

        public static String inputMenu(){
            VistaOutput.mostrarMensaje("Elige una:");
            return sc.nextLine();
        }

        public static String inputPpath() {
            String tipoDePath = "";
            String path = "";
            VistaOutput.mostrarMensaje("Introduce el tipo de path");
            tipoDePath = sc.nextLine();
            return sc.nextLine();

        }

        public static List<String> rellenarArray(){
            List<String> arrayProvisional = new ArrayList<>();

            VistaOutput.mostrarMensaje("Introduce x:");
            arrayProvisional.add(sc.nextLine());
            VistaOutput.mostrarMensaje("Introduce x:");
            arrayProvisional.add(sc.nextLine());
            VistaOutput.mostrarMensaje("Introduce x:");
            arrayProvisional.add(sc.nextLine());

            return arrayProvisional;
        }

}
