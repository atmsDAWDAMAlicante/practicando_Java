package pspRepaso1ev.Modelo;

import pspRepaso1ev.Vista.VistaOutput;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class dbConnectionStatement {
    public static void dbConnectionSQL (Connection conn) {
            String sqlPlanes = "SELECT brand, total_seats FROM planes";
            try (Statement st = conn.createStatement()){
                ResultSet rs = st.executeQuery(sqlPlanes);
                while (rs.next()){
                    VistaOutput.mostrarMensaje(rs.getString(1)+"\t"+rs.getString(2));
                }
            } catch (SQLException e) {
                VistaOutput.mostrarError("dbConnectionSQL", e);
            }

       // return conn
    }
}
