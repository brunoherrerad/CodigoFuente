/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.model;

/**
 *
 * @author vmt-bherrera
 */

public class Usuario{
    private Integer id;
    private String usuario;
    private String nombre;
    private String clave;

    public Usuario() {
    }

    public Usuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }   
    
}
