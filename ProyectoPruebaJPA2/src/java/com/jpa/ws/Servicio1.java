package com.jpa.ws;

import com.jpa.dao.*;

public class Servicio1 {

        /*
	public static void main(String[] args) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.agregarUsuario("Brunito", "Bg12345678", "bherrera2");				
	}*/
	
	public String agregarUsuario(String nombre, String clave, String strUsuario) {
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
