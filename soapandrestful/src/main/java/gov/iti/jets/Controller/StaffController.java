package gov.iti.jets.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import gov.iti.jets.DTOS.Staffdto;
import gov.iti.jets.Service.StaffService;
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

@Path("staff")
public class StaffController {
    StaffService  staffService= new StaffService();

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("{id}")
    public Response getStaffById(@PathParam("id") Short id) {
        try {
            Staffdto staffdto = staffService.getStafflById(id);
            return Response.ok().entity(staffdto).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("all")
    public Response getAllStaffs() {
        try {
            List<Staffdto> staffdtos = staffService.getAllStaff();
            GenericEntity Stores = new GenericEntity<List<Staffdto>>(staffdtos) {
            };
            return Response.ok().entity(Stores).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response addStaff(Staffdto staffdto) {
        try {
            System.out.println("hello from adding City");
            return Response.ok().entity(staffService.AddStaff(staffdto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response UpdateStaff(Staffdto staffdto ) {
        try {
            return Response.ok().entity(staffService.updateStaff(staffdto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @DELETE
    @Path("{id}")
    public Response DeleteStaffById(@PathParam("id") Short id) {
        try {
            return Response.ok().entity(staffService.deleteStaff(id)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
    
}
