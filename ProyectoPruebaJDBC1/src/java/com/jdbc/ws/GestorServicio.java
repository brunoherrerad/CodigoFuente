/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.ws;

/**
 *
 * @author vmt-bherrera
 */
import com.jdbc.conex.*;
import com.jdbc.dao.*;
import com.jdbc.model.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "GestorServicio")
public class GestorServicio {
    
    
//    public static void main(String[] args) {
//        
//        ConexionDB conexion = new ConexionDB();
//        Connection conn = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//        
//        try {
//         conn = conexion.obtenerConexion();
//         String SQL = "SELECT TOP 10 * FROM Usuario";
//         stmt = conn.createStatement();
//         rs = stmt.executeQuery(SQL);
//         while (rs.next()) {
//            System.out.println(rs.getString(1) + ";" + rs.getString(2) + ";" + rs.getString(3));
//         }
//      }
//        
//      catch (Exception e) {
//         e.printStackTrace();
//      }
//      finally {
//         if (rs != null) try { rs.close(); } catch(Exception e) {}
//         if (stmt != null) try { stmt.close(); } catch(Exception e) {}
//         if (conn != null) try { conn.close(); } catch(Exception e) {}
//      }
//   }
    
    
//    public static void main(String[] args)
//    {
//        
//        UsuarioDAO usuarioDAO= new UsuarioDAO();
//        List<Usuario> lstUsuario = new ArrayList<Usuario>();
//        lstUsuario = usuarioDAO.obtenerUsuarios();
//        Iterator iter = lstUsuario.iterator();
//        while (iter.hasNext()){
//            Usuario usuario = new Usuario();
//            usuario = (Usuario) iter.next();
//            
//            System.out.println(usuario.getId() +";" + usuario.getUsuario() +";" + usuario.getClave()+ ";" + usuario.getNombre());
//        }
//        
//    }
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
    @WebMethod(operationName = "obtenerUsuarios")
    public List<Usuario> obtenerUsuarios()
    {
        UsuarioDAO usuarioDAO= new UsuarioDAO();
        List<Usuario> lstUsuario = new ArrayList<Usuario>();
        lstUsuario = usuarioDAO.obtenerUsuarios();
        return lstUsuario;
    }
    
    
}
