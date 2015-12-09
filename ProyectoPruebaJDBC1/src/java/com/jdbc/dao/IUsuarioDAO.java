/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.dao;

/**
 *
 * @author vmt-bherrera
 */
import java.util.List;
import com.jdbc.model.Usuario;

public interface IUsuarioDAO {
    
    public List<Usuario> obtenerUsuarios();
}
