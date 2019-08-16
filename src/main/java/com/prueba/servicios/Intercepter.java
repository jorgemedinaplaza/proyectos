/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.servicios;

import java.io.IOException;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author gerente.tic
 */
@Provider
@PreMatching
public class Intercepter implements ContainerRequestFilter {

    public void filter(ContainerRequestContext request) throws IOException {
       String url= request.getUriInfo().getAbsolutePath().toString();
       if(url.contains("/api/auth"))
           return;
       String token = request.getHeaderString("Authorization");
       
       if(token==null)
       {  JsonObject json = Json.createObjectBuilder()
                                 .add("mensaje","credenciales son necesarias")
                                 .build();
      request.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                                                        .entity(json).type(MediaType.APPLICATION_JSON).build());
      return;
       }
       
       if(!token.equals("AHGC-12BD-1328-75HF-HD64"))
       {  JsonObject json = Json.createObjectBuilder()
                                 .add("mensaje","credenciales incorrectas")
                                 .build();
      request.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                                                        .entity(json).type(MediaType.APPLICATION_JSON).build());
      
       }
}
    
}