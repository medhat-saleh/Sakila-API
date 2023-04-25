package gov.iti.jets.Controller.SoapControllers;

import java.util.List;
import gov.iti.jets.DTOS.Citydto;
import gov.iti.jets.Service.CityService;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class CityController {
    CityService cityService = new CityService();

    public Citydto getCityById(Short id) {

        Citydto citydto = cityService.getCityById(id);
        return citydto;

    }

    public List<Citydto> getAllCiteis() {

        List<Citydto> citydtoss = cityService.getAllCities();
        return citydtoss;

    }

    public Citydto addCity(Citydto citydto) {
        return cityService.AddCity(citydto);

    }

    public boolean UpdateCity(Citydto citydto) {
        return cityService.updateCity(citydto);

    }

    public boolean DeleteCityById(Short id) {

        return cityService.deleteCit(id);

    }
}
