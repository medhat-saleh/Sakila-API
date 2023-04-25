package gov.iti.jets.Controller.RestControllers;

import java.util.List;
import java.util.NoSuchElementException;

import gov.iti.jets.DTOS.Countrydto;
import gov.iti.jets.Service.CountryService;
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

@Path("country")
public class CountryController {
    CountryService countryService = new CountryService();

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("{id}")
    public Response getCountryById(@PathParam("id") Short id) {
        try {
            Countrydto countrydto = countryService.getCountryById(id);
            return Response.ok().entity(countrydto).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("all")
    public Response getAllCountry() {
        try {
            List<Countrydto> countrydtos = countryService.getAllCountries();
            GenericEntity Countries = new GenericEntity<List<Countrydto>>(countrydtos) {
            };
            return Response.ok().entity(Countries).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response addCountry(Countrydto countrydto) {
        try {
            System.out.println("hello from adding City");
            return Response.ok().entity(countryService.Addcountry(countrydto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response UpdateCountry(Countrydto countrydto) {
        try {
            return Response.ok().entity(countryService.updateCountrey(countrydto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @DELETE
    @Path("{id}")
    public Response DeleteCountryrById(@PathParam("id") Short id) {
        try {
            return Response.ok().entity(countryService.deleteCountry(id)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}
