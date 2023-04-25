package gov.iti.jets.Controller.SoapControllers;

import java.util.List;
import gov.iti.jets.DTOS.Inventorydto;
import gov.iti.jets.Service.InventoryService;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class InventoryController {
    InventoryService inventoryService = new InventoryService();

    public Inventorydto getInventoryById(Short id) {

        Inventorydto inventorydto = inventoryService.getinventoryById(id);
        return inventorydto;

    }

    public List<Inventorydto> getAllInventory() {

        List<Inventorydto> inventorydtos = inventoryService.getAllinventory();

        return inventorydtos;

    }

    public Inventorydto addInventory(Inventorydto inventorydto) {

        return inventoryService.Addinventory(inventorydto);

    }

    public boolean UpdateInventory(Inventorydto inventorydto) {

        return inventoryService.updateinventory(inventorydto);
    }

    public boolean DeleteInventoryById(Short id) {

        return inventoryService.deleteinventory(id);

    }
}
