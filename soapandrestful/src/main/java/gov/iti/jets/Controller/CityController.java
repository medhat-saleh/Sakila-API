package gov.iti.jets.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import gov.iti.jets.DTOS.Citydto;
import gov.iti.jets.Service.CityService;
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

@Path("city")
public class CityController {
    CityService cityService = new CityService();

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("{id}")
    public Response getCityById(@PathParam("id") Short id) {
        try {
            Citydto citydto = cityService.getCityById(id);
            return Response.ok().entity(citydto).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("all")
    public Response getAllCiteis() {
        try {
            List<Citydto> citydtoss = cityService.getAllCities();
            GenericEntity cities = new GenericEntity<List<Citydto>>(citydtoss) {
            };
            return Response.ok().entity(cities).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response addCity(Citydto citydto) {
        try {
            System.out.println("hello from adding City");
            return Response.ok().entity(cityService.AddCity(citydto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response UpdateCity(Citydto citydto) {
        try {
            return Response.ok().entity(cityService.updateCity(citydto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @DELETE
    @Path("{id}")
    public Response DeleteCityById(@PathParam("id") Short id) {
        try {
            return Response.ok().entity(cityService.deleteCit(id)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}
