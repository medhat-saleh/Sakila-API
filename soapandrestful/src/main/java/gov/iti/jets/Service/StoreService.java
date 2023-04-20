package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Staffdto;
import gov.iti.jets.DTOS.Storedto;
import gov.iti.jets.Mapper.StoreMapper;
import gov.iti.jets.entity.Store;

public class StoreService {
    GenericDao dao = new GenericDao<Store>(Store.class);

    public Storedto getStoreId(int id) {
        Storedto storedto = StoreMapper.INSTANCE.todto((Store) dao.findById(id));

        return storedto;
    }

    public List<Storedto> getAllStores() {
        return dao.getAll(Store.class).stream().map(store -> StoreMapper.INSTANCE.todto((Store) store))
                .toList();

    }

    public boolean updateStore(Storedto storedto) {
        Store store=StoreMapper.INSTANCE.toentity(storedto);
        return dao.update( store);
    }

    public boolean deleteStore(int storId) {
        return dao.delete(storId);
    }

    public Storedto AddStore(Storedto storedto) {
        return StoreMapper.INSTANCE.todto((Store) dao.insert(StoreMapper.INSTANCE.toentity(storedto)));
    }

    public List<Storedto> StoreByName(String name) {
        return dao.findByName(name, Store.class).stream()
                .map(store -> StoreMapper.INSTANCE.todto((Store) store)).toList();
    } 
}
