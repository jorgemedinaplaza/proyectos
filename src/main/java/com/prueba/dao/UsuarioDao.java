/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dao;

/**
 *
 * @author gerente.tic
 */
public class UsuarioDao {
    public static boolean validar (String username, String pass)
    {
    return(username.equals("admin")&&pass.equals("admin"));
    }
}
