package gov.iti.jets.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import gov.iti.jets.DTOS.Filmdto;
import gov.iti.jets.Service.FilmService;
import gov.iti.jets.entity.Film;
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

@Path("film")
public class FilmController {
    FilmService filmService = new FilmService();

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("{id}")
    public Response getFilmById(@PathParam("id") Short id) {
        try {
            Filmdto filmdto = filmService.getFilmById(id);
            return Response.ok().entity(filmdto).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("all")
    public Response getAllFilms() {
        try {
            List<Filmdto> customerdtos = filmService.getAllFilmds();
            GenericEntity allFilms = new GenericEntity<List<Filmdto>>(customerdtos) {
            };
            return Response.ok().entity(allFilms).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response addFilm(Filmdto filmdto) {
        try {
            System.out.println("hello from adding Film");
            return Response.ok().entity(filmService.AddFilm(filmdto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response UpdateFilm(Filmdto filmdto) {
        try {
            return Response.ok().entity(filmService.updateFilm(filmdto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @DELETE
    @Path("{id}")
    public Response DeleteFilmById(@PathParam("id") Short id) {
        try {
            return Response.ok().entity(filmService.deleteFilm(id)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}
