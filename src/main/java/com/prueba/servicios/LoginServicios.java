/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.servicios;

import com.prueba.dao.UsuarioDao;
import com.prueba.modelo.Usuario;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;






/**
 *
 * @author gerente.tic
 */

@Path("auth")
public class LoginServicios {
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    
    public Response validar(Usuario usuario){
    
        boolean status = UsuarioDao.validar(usuario.getUsername(),usuario.getPass());
        
       if(status)
       {
           String HASH = "AHGC-12BD-1328-75HF-HD64";
           JsonObject json = Json.createObjectBuilder()
                                 .add("token",HASH)
                                 .build();
          return Response.status(Response.Status.CREATED).entity(json).build();
       
       }
       JsonObject json = Json.createObjectBuilder()
                             .add("mensaje", "datos incorrectos")
                                 .build();
          
         return Response.status(Response.Status.UNAUTHORIZED)
                 
                                          .entity(json)
                                          .build();
                             
       
    }
    
}
