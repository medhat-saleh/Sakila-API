package gov.iti.jets.Controller.RestControllers;

import java.util.List;
import java.util.NoSuchElementException;

import gov.iti.jets.DTOS.Countrydto;
import gov.iti.jets.DTOS.Customerdto;
import gov.iti.jets.Service.CustomerService;
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

@Path("customer")
public class CustomerController {
    CustomerService customerService = new CustomerService();

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("{id}")
    public Response getCustomerById(@PathParam("id") Short id) {
        try {
            Customerdto customerdto = customerService.getCustomerById(id);
            return Response.ok().entity(customerdto).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("all")
    public Response getAllCustomers() {
        try {
            List<Customerdto> customerdtos = customerService.getAllCustomers();
            GenericEntity Customers = new GenericEntity<List<Customerdto>>(customerdtos) {
            };
            return Response.ok().entity(Customers).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response addCustomer(Customerdto customerdto) {
        try {
            System.out.println("hello from adding City");
            return Response.ok().entity(customerService.AddCustomer(customerdto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response UpdateCustomer(Customerdto customerdto) {
        try {
            return Response.ok().entity(customerService.updateCustomer(customerdto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @DELETE
    @Path("{id}")
    public Response DeleteCustomerById(@PathParam("id") Short id) {
        try {
            return Response.ok().entity(customerService.deleteCustomer(id)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}
