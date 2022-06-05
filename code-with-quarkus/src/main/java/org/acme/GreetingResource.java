package org.acme;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
//import static spark.Spark.*;
import org.jboss.resteasy.annotations.jaxrs.PathParam;



import com.google.gson.Gson;

@Path("")
public class GreetingResource {
	
	Model model = new Model();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    //@Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        
    	
    	//Controller controller = new Controller(model);
    	
    	//controller.buscarCarro();
    	//controller.buscarCarroPlaca();
    	//controller.buscarCarroModelo();
	
		
		return "Helloasfasdfasf RESTEasy!!!";
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/carro/{modelo}/{marca}/{cor}/")
    public Response carro2(@PathParam String modelo, @PathParam String marca, @PathParam String cor) {
    	
    	List<Carro> carrosEncontrados = model.buscarEspecificacao(new Especificacao(modelo, marca, cor));
    	String json = new Gson().toJson(carrosEncontrados);
    	return Response.status(200).entity(json).build();
    	}
    
}