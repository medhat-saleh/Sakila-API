package gov.iti.jets.Controller.SoapControllers;

import java.util.List;
import gov.iti.jets.DTOS.Addressdto;
import gov.iti.jets.Service.AdressService;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class AddressController {
    AdressService adressService = new AdressService();

   
    public Addressdto getAddressById( Short id) {
        
            Addressdto addressdto = adressService.geAddressById(id);
            return addressdto;
       
    }

    public  List<Addressdto> getAllAdresses() {
            List<Addressdto> addressdtos = adressService.getAllAddresses();
            
            return addressdtos;
       
    }

    public Addressdto addAddress(Addressdto addressdto) {

        return adressService.AddAddress(addressdto);
       

    }

    public boolean UpdateAddress(Addressdto addressdto) {
            return adressService.updateAddress(addressdto);
        
    }

    public boolean DeleteAddressById( Short id) {
            return adressService.deleteAddress(id);
        
    }


}
