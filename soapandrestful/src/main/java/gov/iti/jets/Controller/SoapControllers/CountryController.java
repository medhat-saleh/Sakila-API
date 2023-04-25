package gov.iti.jets.Controller.SoapControllers;

import java.util.List;
import gov.iti.jets.DTOS.Countrydto;
import gov.iti.jets.Service.CountryService;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class CountryController {
    CountryService countryService = new CountryService();


    public Countrydto getCountryById(Short id) {
     
            Countrydto countrydto = countryService.getCountryById(id);
            return countrydto;
        
    }

   
    public List<Countrydto> getAllCountry() {
      
            List<Countrydto> countrydtos = countryService.getAllCountries();
           
            return countrydtos;
       
    }

    public Countrydto addCountry(Countrydto countrydto) {
        
            return countryService.Addcountry(countrydto);
        
        
    }

    public boolean UpdateCountry(Countrydto countrydto) {
            return countryService.updateCountrey(countrydto);
       

    }

 
    public boolean DeleteCountryrById( Short id) {
            return countryService.deleteCountry(id);
       
    }
}
