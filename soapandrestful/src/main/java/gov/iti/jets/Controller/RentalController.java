package gov.iti.jets.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import gov.iti.jets.DTOS.Rentaldto;
import gov.iti.jets.Service.RentalService;
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

@Path("rental")
public class RentalController {
    RentalService  rentalService= new RentalService();

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("{id}")
    public Response getStaffById(@PathParam("id") Short id) {
        try {
            Rentaldto rentaldto = rentalService.getRentalById(id);
            return Response.ok().entity(rentaldto).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("all")
    public Response getAllStaffs() {
        try {
            List<Rentaldto> rentaldtos = rentalService.getAllRentals();
            GenericEntity rentaals = new GenericEntity<List<Rentaldto>>(rentaldtos) {
            };
            return Response.ok().entity(rentaals).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response addStaff(Rentaldto rentaldto) {
        try {
            System.out.println("hello from adding City");
            return Response.ok().entity(rentalService.AddRental(rentaldto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response UpdateStaff(Rentaldto rentaldto ) {
        try {
            return Response.ok().entity(rentalService.updateRental(rentaldto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @DELETE
    @Path("{id}")
    public Response DeleteStaffById(@PathParam("id") Short id) {
        try {
            return Response.ok().entity(rentalService.deleteRental(id)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
    
}
