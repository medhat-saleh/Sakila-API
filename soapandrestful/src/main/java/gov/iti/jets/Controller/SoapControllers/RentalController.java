package gov.iti.jets.Controller.SoapControllers;

import java.util.List;
import gov.iti.jets.DTOS.Rentaldto;
import gov.iti.jets.Service.RentalService;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class RentalController {
    RentalService rentalService = new RentalService();

    public Rentaldto getRentalById(Short id) {

        Rentaldto rentaldto = rentalService.getRentalById(id);
        return rentaldto;
    }

    public List<Rentaldto> getAllRentals() {

        List<Rentaldto> rentaldtos = rentalService.getAllRentals();

        return rentaldtos;

    }

    public Rentaldto addRental(Rentaldto rentaldto) {
        return rentalService.AddRental(rentaldto);
    }

    public boolean UpdateRental(Rentaldto rentaldto) {

        return rentalService.updateRental(rentaldto);

    }

    public boolean DeleteRentalById(Short id) {

        return rentalService.deleteRental(id);
    }

}
