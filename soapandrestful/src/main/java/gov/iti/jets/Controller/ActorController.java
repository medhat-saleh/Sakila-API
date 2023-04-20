package gov.iti.jets.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Actordto;
import gov.iti.jets.Mapper.ActorMapper;
import gov.iti.jets.Service.ActorService;
import gov.iti.jets.entity.Actor;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("actors")
public class ActorController {
  ActorService actorService=new ActorService();
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Path("{id}")
    public Response getActorById(@PathParam("id") Integer id){
        System.out.println("        Med     hat    ");
        try {
            Actordto actordto=actorService.geActordtoById(id);
            System.out.println(actordto);
            return Response.ok().entity(actordto).build();
        }
        catch (NoSuchElementException exception){
            throw new RuntimeException(exception.getMessage());
        }
    }
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Path("all")
    public Response getAllActor(){
        System.out.println("        Med     hat    ");
        try {
            List<Actordto> actordto=actorService.getAllActor();
            System.out.println(actordto);
            return Response.ok().entity(actordto).build();
        }
        catch (NoSuchElementException exception){
            throw new RuntimeException(exception.getMessage());
        }
    }
    @GET
    public void Hello(){
        System.out.println("*********************************************************   ");
       
    }
}
