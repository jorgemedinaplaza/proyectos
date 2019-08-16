/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.modelo;



/**
 *
 * @author gerente.tic
 */
public class DatosPersonas {
    public int id;
    public String nombre;
    public String apellido;
    public String documentoid;
    public int ntarjeta;
    
   public DatosPersonas(){
   
   }

    public DatosPersonas(int id, String nombre, String apellido, String documentoid, int ntarjeta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoid = documentoid;
        this.ntarjeta = ntarjeta;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumentoid() {
        return documentoid;
    }

    public int getNtarjeta() {
        return ntarjeta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumentoid(String documentoid) {
        this.documentoid = documentoid;
    }

    public void setNtarjeta(int ntarjeta) {
        this.ntarjeta = ntarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DatosPersonas other = (DatosPersonas) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    
    
    
   
   
    
}
