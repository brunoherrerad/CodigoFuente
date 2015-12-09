/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.ws;

import com.jpa.dao.UsuarioDAO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author vmt-bherrera
 */
@WebService(serviceName = "GestorServicio1")
public class GestorServicio1 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "agregarUsuario")
    public String agregarUsuario(@WebParam(name = "name1")String nombre, String clave, String strUsuario) {
    String mensaje ="";
    try
    {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.agregarUsuario(nombre, clave, strUsuario);	
    }
    catch(Exception ex)
    {
        mensaje = ex.toString();
    }
    return mensaje;
    }
}
