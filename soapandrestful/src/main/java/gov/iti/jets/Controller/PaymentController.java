package gov.iti.jets.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import gov.iti.jets.DTOS.Paymentdto;
import gov.iti.jets.Service.PaymentService;
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

@Path("payment")

public class PaymentController {
    PaymentService  paymentService= new PaymentService();

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("{id}")
    public Response getStaffById(@PathParam("id") Short id) {
        try {
        Paymentdto paymentdto = paymentService.getpaymentById(id);
            return Response.ok().entity(paymentdto).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("all")
    public Response getAllStaffs() {
        try {
            List<Paymentdto> paymentdtos = paymentService.getAllpayment();
            GenericEntity payments = new GenericEntity<List<Paymentdto>>(paymentdtos) {
            };
            return Response.ok().entity(payments).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response addStaff(Paymentdto paymentdto) {
        try {
            System.out.println("hello from adding City");
            return Response.ok().entity(paymentService.Addpayment(paymentdto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response UpdateStaff(Paymentdto paymentdto ) {
        try {
            return Response.ok().entity(paymentService.updatepayment(paymentdto)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }

    }

    @DELETE
    @Path("{id}")
    public Response DeleteStaffById(@PathParam("id") Short id) {
        try {
            return Response.ok().entity(paymentService.deletepayment(id)).build();
        } catch (NoSuchElementException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
    
}
