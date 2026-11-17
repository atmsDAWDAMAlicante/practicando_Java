package pspRepaso1ev.Modelo;
import pspRepaso1ev.Vista.*;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException; // necesario porque trhows todos los Override
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.ParserConfigurationException;


import java.io.Serializable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.List;
import java.util.ArrayList;

public class ElTiempo {
    public static void main() {
        VistaOutput.mostrarMensaje("El Tiempo - AEMET");
        try {
            // 1º SAXParser coge SAXParserFactori
            SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
            // 2º Objeto SAXParser  método parse 2 parámetros: URL y OBJETO
            saxParser.parse("https://www.aemet.es/xml/municipios/localidad_03014.xml", new myXMLHandler());
        } catch (Exception e) {
            VistaOutput.mostrarError("SAXParser", e);
        }

        /*} catch (SAXException | ParserConfigurationException e) {
            VistaOutput.mostrarError("SAXParser", e);
        }*/
    }
}
// con la declaración de la clase, en el objeto SAXParser no dará error
class myXMLHandler extends DefaultHandler{
    List<String> agenda = new ArrayList<>();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
        if (qName.equals("prediccion")){
            VistaOutput.mostrarMensaje(attributes.getValue("estado_cielo"));
        }
        if (qName.equals("root")){
            VistaOutput.mostrarMensaje(attributes.getValue("prediction"));
        }
    }
}
