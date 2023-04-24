package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Addressdto;
import gov.iti.jets.DTOS.Staffdto;
import gov.iti.jets.DTOS.Storedto;
import gov.iti.jets.Mapper.AddressMapper;
import gov.iti.jets.Mapper.StaffMapper;
import gov.iti.jets.Mapper.StoreMapper;
import gov.iti.jets.entity.Address;
import gov.iti.jets.entity.Staff;
import gov.iti.jets.entity.Store;

public class StoreService {
    GenericDao dao = new GenericDao<Store>(Store.class);

    public Storedto getStoreId(int id) {
        Store store = (Store) dao.findById(id);
        Storedto storedto = StoreMapper.INSTANCE.todto(store);
        storedto.setAddressdto(AddressMapper.INSTANCE.todto(store.getAddress()));
        storedto.setStaffdto(StaffMapper.INSTANCE.todto(store.getStaff()));

        return storedto;
    }

    public List<Storedto> getAllStores() {

        return dao.getAll(Store.class).stream().map(store -> StoreMapper.INSTANCE.todto((Store) store))
                .toList();

    }

    public boolean updateStore(Storedto storedto) {

        Store store = StoreMapper.INSTANCE.toentity(storedto);

        store.setAddress(AddressMapper.INSTANCE.toentity(storedto.getAddressdto()));
        store.setStaff(StaffMapper.INSTANCE.toentity(storedto.getStaffdto()));
        return dao.update(store);
    }

    public boolean deleteStore(int storId) {
        return dao.delete(storId);
    }

    public Storedto AddStore(Storedto storedto) {
        Store store = StoreMapper.INSTANCE.toentity(storedto);
        System.out.println("hello from adding store");

        System.out.println(storedto.getAddressdto());
        store.setAddress(AddressMapper.INSTANCE.toentity(storedto.getAddressdto()));
        store.setStaff(StaffMapper.INSTANCE.toentity(storedto.getStaffdto()));
        store = (Store) dao.insert(store);
        return StoreMapper.INSTANCE.todto(store);
    }

   
}
