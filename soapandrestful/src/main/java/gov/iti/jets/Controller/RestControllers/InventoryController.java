package gov.iti.jets.Controller.RestControllers;

import java.util.List;
import java.util.NoSuchElementException;

import gov.iti.jets.DTOS.Inventorydto;
import gov.iti.jets.Service.InventoryService;
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

@Path("inventory")
public class InventoryController {
    InventoryService inventoryService = new InventoryService();

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("{id}")
    public Response getInventoryById(@PathParam("id") Short id) {
        try {
            
            Inventorydto inventorydto = inventoryService.getinventoryById(id);
            return Response.ok().entity(inventorydto).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("all")
    public Response getAllInventory() {
        try {
            List<Inventorydto> inventorydtos = inventoryService.getAllinventory();
            GenericEntity inventoys = new GenericEntity<List<Inventorydto>>(inventorydtos) {
            };
            return Response.ok().entity(inventoys).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response addInventory(Inventorydto inventorydto) {
        try {
            return Response.ok().entity(inventoryService.Addinventory(inventorydto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response UpdateInventory(Inventorydto inventorydto) {
        try {
            return Response.ok().entity(inventoryService.updateinventory(inventorydto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @DELETE
    @Path("{id}")
    public Response DeleteInventoryById(@PathParam("id") Short id) {
        try {
            return Response.ok().entity(inventoryService.deleteinventory(id)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }   
}
