package gov.iti.jets.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import gov.iti.jets.DTOS.Categorydto;
import gov.iti.jets.Service.CategoryServece;
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

@Path("category")
public class CategoryController {
    CategoryServece categoryServece = new CategoryServece();

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("{id}")
    public Response getCategoryById(@PathParam("id") Short id) {
        try {
            
            Categorydto categorydto = categoryServece.getCategoryById(id);
            return Response.ok().entity(categorydto).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("all")
    public Response getAllCategories() {
        try {
            List<Categorydto> categorydtos = categoryServece.getAllCategories();
            GenericEntity categories = new GenericEntity<List<Categorydto>>(categorydtos) {
            };
            return Response.ok().entity(categories).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response addInventory(Categorydto categorydto) {
        try {
            return Response.ok().entity(categoryServece.AddCategory(categorydto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response UpdateInventory(Categorydto categorydto) {
        try {
            return Response.ok().entity(categoryServece.updateCategory(categorydto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @DELETE
    @Path("{id}")
    public Response DeleteInventoryById(@PathParam("id") Short id) {
        try {
            return Response.ok().entity(categoryServece.DeleteCategoryById(id)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    } 
}
