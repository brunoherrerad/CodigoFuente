/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.jdbc.conex.*;
import com.jdbc.model.*;
/**
 *
 * @author vmt-bherrera
 */
public class UsuarioDAO extends ConexionDB implements IUsuarioDAO  {
    public List<Usuario> obtenerUsuarios() {

        List<Usuario> lstUsuario = new ArrayList<Usuario>();
        CallableStatement oraCallStmt = null;
        ResultSet rss = null;
        Connection conn = null;
        try {
                conn = obtenerConexion();
                if (conn != null) {
                        oraCallStmt = (CallableStatement) conn.prepareCall("{CALL dbo.sp_Consulta_Usuarios()}");
                        //oraCallStmt.setInt(1, dato.getCodEjecucion());
                        rss = oraCallStmt.executeQuery();

                        while (rss.next()) {
                                Usuario dato = new Usuario();
                                dato.setId(rss.getInt(1));
                                dato.setUsuario(rss.getString(2));
                                dato.setClave(rss.getString(3));
                                dato.setNombre(rss.getString(4));
                                lstUsuario.add(dato);
                        }
                } else {
                        System.out.println("Error conexion");
                }
        } catch (Exception e) {
                e.printStackTrace();
        } finally {
                try {
                        oraCallStmt.close();
                } catch (SQLException e) {
                }

                try {
                        rss.close();
                } catch (SQLException e) {
                }

                try {
                        if (conn != null)
                                conn.close();
                } catch (SQLException e) {
                }
        }
        return lstUsuario;
    }
}
