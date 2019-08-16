/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.servicios;

import com.prueba.dao.DatosProductoBancario;
import com.prueba.modelo.DatosPersonas;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



/**
 *
 * @author gerente.tic
 */
@Path("persona")
public class PersonaServicios {
    
    private static  List<DatosPersonas> lista = DatosProductoBancario.getDatosPersonales();

    /**
     *
     * @return
     */
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersonas(){
   
        return Response.ok(lista).build();
    
    }
     @GET 
     @Path("/{id}")
     @Produces(MediaType.APPLICATION_JSON)
    public Response getPersona(@PathParam("id") int id){
    
        System.out.println(id);
    DatosPersonas datospersonas= new DatosPersonas();
    datospersonas.setId(id);
   
            
    if(lista.contains(datospersonas)){
        
         for (DatosPersonas obj:lista)
             if(obj.getId()==id)
                 
                 return Response.ok(obj).build();
    }
    return Response.status(Response.Status.NOT_FOUND).build();
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response EliminarPersona(@PathParam("id")int id){
    
    DatosPersonas datospersonas= new DatosPersonas();
    datospersonas.setId(id);
   
            
    if(lista.contains(datospersonas)){
        
      lista.remove(datospersonas);
            
                 return Response.ok().build();
    }
    return Response.status(Response.Status.NOT_FOUND).build();
    }
    
     @POST
     @Produces(MediaType.APPLICATION_JSON)
     @Consumes(MediaType.APPLICATION_JSON)
    public Response guardarPersona(DatosPersonas datospersonas){
    
        lista.add(datospersonas);
    
            return Response.status(Response.Status.CREATED).entity(datospersonas).build();
    }

}
