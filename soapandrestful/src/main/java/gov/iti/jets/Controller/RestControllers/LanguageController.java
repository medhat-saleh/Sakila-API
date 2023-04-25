package gov.iti.jets.Controller.RestControllers;

import java.util.List;
import java.util.NoSuchElementException;

import gov.iti.jets.DTOS.Languagedto;
import gov.iti.jets.Service.LanguageService;
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

@Path("language")
public class LanguageController {
    LanguageService languageService = new LanguageService();

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("{id}")
    public Response getLanguageById(@PathParam("id") Short id) {
        try {

            Languagedto languagedto = languageService.getLanguageById(id);
            return Response.ok().entity(languagedto).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("all")
    public Response getAllLanguages() {
        try {
            List<Languagedto> languagedtos = languageService.getAllLanguages();
            GenericEntity languages = new GenericEntity<List<Languagedto>>(languagedtos) {
            };
            return Response.ok().entity(languages).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response addLanguage(Languagedto languagedto) {
        try {
            return Response.ok().entity(languageService.AddLanguage(languagedto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response UpdateLanguage(Languagedto languagedto) {
        try {
            return Response.ok().entity(languageService.updateLanguage(languagedto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @DELETE
    @Path("{id}")
    public Response DeleteLanguageById(@PathParam("id") Short id) {
        try {
            return Response.ok().entity(languageService.deleteLanguage(id)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}
