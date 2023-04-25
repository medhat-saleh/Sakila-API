package gov.iti.jets.Controller.RestControllers;

import java.util.List;
import java.util.NoSuchElementException;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.ActorDTO.Actordto;
import gov.iti.jets.Mapper.ActorMapper;
import gov.iti.jets.Service.ActorService;
import gov.iti.jets.entity.Actor;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.GenericEntity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("actors")
public class ActorController {
    ActorService actorService = new ActorService();

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("{id}")
    public Response getActorById(@PathParam("id") Integer id) {
        try {
            Actordto actordto = actorService.geActordtoById(id);
            System.out.println(actordto);
            return Response.ok().entity(actordto).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("all")
    public Response getAllActor() {
        try {
            List<Actordto> actordtos = actorService.getAllActor();
            GenericEntity Actors = new GenericEntity<List<Actordto>>(actordtos) {
            };
            System.out.println(actordtos);

            return Response.ok().entity(Actors).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response addActor(Actordto actordto) {
        try {
         System.out.println("hello from adding Actor");
            return Response.ok().entity(actorService.AddActor(actordto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response UpdateActor(Actordto actordto) {
        try {
            actorService.updateActor(actordto);
            System.out.println(actordto);
            return Response.ok().entity(actorService.updateActor(actordto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @DELETE
    @Path("{id}")
    public Response DeleteActorById(@PathParam("id") Integer id) {
        try {
            return Response.ok().entity(actorService.deleteActor(id)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}
