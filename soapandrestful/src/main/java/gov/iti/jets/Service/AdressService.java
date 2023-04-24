package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Addressdto;
import gov.iti.jets.DTOS.Customerdto;
import gov.iti.jets.DTOS.Staffdto;
import gov.iti.jets.DTOS.Storedto;
import gov.iti.jets.Mapper.AddressMapper;
import gov.iti.jets.Mapper.CustomerMapper;
import gov.iti.jets.Mapper.StaffMapper;
import gov.iti.jets.Mapper.StoreMapper;
import gov.iti.jets.entity.Address;

public class AdressService {

    GenericDao dao = new GenericDao<Address>(Address.class);

    public Addressdto geAddressById(int id) {
        Addressdto addressdto = AddressMapper.INSTANCE.todto((Address) dao.findById(id));

        return addressdto;
    }

    public List<Addressdto> getAllAddresses() {
        return dao.getAll(Address.class).stream().map(address -> AddressMapper.INSTANCE.todto((Address) address))
                .toList();

    }

    public boolean updateAddress(Addressdto addressdto) {
        Address address = AddressMapper.INSTANCE.toentity(addressdto);
        return dao.update(address);
    }

    public boolean deleteAddress(int addressId) {
        return dao.delete(addressId);
    }

    public Addressdto AddAddress(Addressdto addressdto) {
        return AddressMapper.INSTANCE.todto((Address) dao.insert(AddressMapper.INSTANCE.toentity(addressdto)));
    }
    // public List<Staffdto> getAddresssstaff(int addressId) {
    //     // for(int i=1;i<300;i++){
    //     //     Address address= (Address)dao.findById(i);

    //     //     address.getStaffs().forEach(t ->System.out.println(t+"hala") );

    //     // }

    //    Address address= (Address)dao.findById(addressId);

    //    address.getStaffs().forEach(t ->System.out.println(t.getEmail()) );

    //     return address.getStaffs().stream()
    //             .map(staff -> StaffMapper.INSTANCE.todto(staff)).toList();
    // }

    // public List<Customerdto> getAddresssscustommer(int addressId) {
    //     dao.findById(addressId);

    //     return ((Address) dao.findById(addressId)).getCustomers().stream()
    //             .map(customer -> CustomerMapper.INSTANCE.todto(customer)).toList();
    // }

    // public List<Storedto> getAddressStors(int addressId) {
    //     dao.findById(addressId);

    //     return ((Address) dao.findById(addressId)).getStores().stream()
    //             .map(store -> StoreMapper.INSTANCE.todto(store)).toList();
    // }
}
