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
public class Usuario {
    
    private String username;
    private String pass;

    public Usuario(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public Usuario() {
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
}
