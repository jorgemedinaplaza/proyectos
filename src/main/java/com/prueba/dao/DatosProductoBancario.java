/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dao;

import com.prueba.modelo.DatosPersonas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gerente.tic
 */
public class DatosProductoBancario {
    
   
        public static List<DatosPersonas>getDatosPersonales()
        {
            List<DatosPersonas> lista= new ArrayList();
            DatosPersonas per1= new DatosPersonas(1,"Jorge","Medina","1127625712",38);
            DatosPersonas per2= new DatosPersonas(2,"Maria","Plaza","1030252369",48);
            DatosPersonas per3= new DatosPersonas(3,"Camila", "Cuevas","30123789",38);
            DatosPersonas per4= new DatosPersonas(4,"Viviana", "Mendez","568963369",37);
           
            lista.add(per1);
            lista.add(per2);
            lista.add(per3);
            lista.add(per4);
            
            
            return lista;
        }
    
    }
    

