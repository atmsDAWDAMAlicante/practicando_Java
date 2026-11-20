package pspRepaso1ev.Modelo;

import pspRepaso1ev.Vista.VistaOutput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;


public class dbSoloConnection {
    public static void soloConnection() {
        Connection conn = null;
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("src/main/resources/config.properties")) {
            properties.load(input);
            try {
                Class.forName("org.postgresql.Driver");
                String url = properties.getProperty("db.url");
                String user = properties.getProperty("db.user");
                String password = properties.getProperty("db.password");
                conn = DriverManager.getConnection(url, user, password);

                if (conn != null){
                    VistaOutput.mostrarMensaje("MODELO Conexión establecida");

                } else {
                    VistaOutput.mostrarMensaje("MODELO Conexión fallida");
                }

            } catch (SQLException  | ClassNotFoundException e){
                VistaOutput.mostrarError("Connection", e);

            }

        } catch (IOException e) {
            VistaOutput.mostrarError("Abriendo properties", e);

        }
        dbConnectionStatement.dbConnectionSQL(conn);
    }
}

