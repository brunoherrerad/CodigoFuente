/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.conex;

/**
 *
 * @author vmt-bherrera
 */

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {


private Connection conn = null;
private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

private String databaseServer = "localhost";
private String databasePort = "1433";
private String databaseName = "Desarrollo";
private String user = "sa";
private String password = "Bg123456";

private String url;

    public Connection obtenerConexion() {
        try {
            if (conn == null || conn.isClosed()) {
                crearConexion();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public Connection crearConexion() {
        try {
            System.out.println("Conectandose");
            Class.forName(driver);
            url = "jdbc:sqlserver://" + databaseServer + ":" + databasePort
                + ";databaseName=" + databaseName
                +";user=" + user + ";password=" + password;

            System.out.println(url);

            conn = DriverManager.getConnection(url);
            System.out.println("Connected...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    return conn;
    }
}