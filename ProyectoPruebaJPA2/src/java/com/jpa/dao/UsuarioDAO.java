package com.jpa.dao;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.jpa.utils.*;
import com.jpa.model.*;
import javax.persistence.EntityManager;

public class UsuarioDAO {
	
	Utilidades util = new Utilidades();
	
	public String agregarUsuario(String nombre, String clave, String strUsuario) {
	String mensaje = "";
        try{
            EntityManagerFactory emf = util.ObtenerEntityManager();

            EntityManager em = emf.createEntityManager();

            Usuario usuario = new Usuario();

            //int id = null;
            //String nombre = "Manuel";
            //String clave = "Bg123456";
            //String strUsuario = "bherrera";

            //usuario.setId(null);
            usuario.setNombre(nombre);
            usuario.setClave(clave);
            usuario.setUsuario(strUsuario);

            em.getTransaction().begin();
            em.persist(usuario);

            em.getTransaction().commit();
            em.close();
            emf.close();
        }
        catch(Exception ex)
        {
            mensaje = ex.toString();
        }
        return mensaje;

        }
}
