package gov.iti.jets.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import gov.iti.jets.DTOS.Addressdto;
import gov.iti.jets.DTOS.Customerdto;
import gov.iti.jets.DTOS.Staffdto;
import gov.iti.jets.DTOS.Storedto;
import gov.iti.jets.Service.AdressService;
import gov.iti.jets.entity.Store;
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

@Path("adress")
public class AddressController {
    AdressService adressService = new AdressService();

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("{id}")
    public Response getAddressById(@PathParam("id") Short id) {
        try {
            Addressdto addressdto = adressService.geAddressById(id);
            return Response.ok().entity(addressdto).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("all")
    public Response getAllAdresses() {
        try {
            List<Addressdto> addressdtos = adressService.getAllAddresses();
            GenericEntity addresses = new GenericEntity<List<Addressdto>>(addressdtos) {
            };
            return Response.ok().entity(addresses).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response addAddress(Addressdto addressdto) {
        try {
            System.out.println("hello from adding address");
            return Response.ok().entity(adressService.AddAddress(addressdto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response UpdateAddress(Addressdto addressdto) {
        try {
            return Response.ok().entity(adressService.updateAddress(addressdto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @DELETE
    @Path("{id}")
    public Response DeleteAddressById(@PathParam("id") Short id) {
        try {
            return Response.ok().entity(adressService.deleteAddress(id)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }


}
