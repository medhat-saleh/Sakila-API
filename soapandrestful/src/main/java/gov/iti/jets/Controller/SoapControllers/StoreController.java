package gov.iti.jets.Controller.SoapControllers;

import java.util.List;
import gov.iti.jets.DTOS.Storedto;
import gov.iti.jets.Service.StoreService;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.ws.rs.PathParam;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class StoreController {
    StoreService storeService = new StoreService();

    public Storedto getStoreById(Short id) {

        Storedto storedto = storeService.getStoreId(id);
        return storedto;
    }

    public List<Storedto> getAllStore() {

        List<Storedto> storedtos = storeService.getAllStores();
        return storedtos;

    }

    public Storedto addStore(Storedto storedto) {

        return storeService.AddStore(storedto);

    }

    public boolean UpdateStore(Storedto storedto) {

        return storeService.updateStore(storedto);

    }

    public boolean DeleteStorerById(@PathParam("id") Short id) {

        return storeService.deleteStore(id);

    }
}
