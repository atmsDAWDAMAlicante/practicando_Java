package pspRepaso1ev.Modelo;

import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.helpers.DefaultHandler;
import pspRepaso1ev.Vista.VistaOutput;

// FileInputStream & Properties
import java.io.*;
import java.util.Properties;

// XML
// Parser
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class MusicaDeLos80 {
    public static void musica80(){
        String ruta = rutaProperties();
        VistaOutput.mostrarMensaje(ruta);
        losParsers(ruta);

    }

    public static String rutaProperties(){
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("src/main/resources/config.properties")){
            properties.load(input);
            return properties.getProperty("path.XMLmusicaDeLos80");
        } catch (IOException e) {
            VistaOutput.mostrarError("ruta", e);
        }
            return "";
    }

    public static void losParsers(String ruta) {
        try {
            SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
            saxParser.parse(ruta, new MiHandler());
        }  catch (Exception e){
            VistaOutput.mostrarError("losParsers", e);
        }
    }


}
class MiHandler extends DefaultHandler {
    String x = "";
}