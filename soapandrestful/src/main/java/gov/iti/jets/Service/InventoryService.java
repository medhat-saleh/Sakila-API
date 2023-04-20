package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Inventorydto;
import gov.iti.jets.Mapper.InventoryMapper;
import gov.iti.jets.entity.Inventory;

public class InventoryService {
    GenericDao dao = new GenericDao<Inventory>(Inventory.class);

    public Inventorydto getinventoryById(int id) {
        Inventorydto inventorydto = InventoryMapper.INSTANCE.todto((Inventory) dao.findById(id));

        return inventorydto;
    }

    public List<Inventorydto> getAllinventory() {
        return dao.getAll(Inventory.class).stream().map(inventory -> InventoryMapper.INSTANCE.todto((Inventory) inventory))
                .toList();

    }

    public boolean updateinventory(Inventorydto inventorydto) {
        Inventory inventory=InventoryMapper.INSTANCE.toentity(inventorydto);
        return dao.update( inventory);
    }

    public boolean deleteinventory(int inventoryId) {
        return dao.delete(inventoryId);
    }

    public Inventorydto Addinventory(Inventorydto inventorydto) {
        return InventoryMapper.INSTANCE.todto((Inventory) dao.insert(InventoryMapper.INSTANCE.toentity(inventorydto)));
    }

    public List<Inventorydto> inventoryByName(String name) {
        return dao.findByName(name, Inventory.class).stream()
                .map(inventory -> InventoryMapper.INSTANCE.todto((Inventory) inventory)).toList();
    }
}
