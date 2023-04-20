package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Addressdto;
import gov.iti.jets.Mapper.AddressMapper;
import gov.iti.jets.entity.Address;

public class AdressService {

    GenericDao dao = new GenericDao<Address>(Address.class);

    public Addressdto geActordtoById(int id) {
        Addressdto addressdto = AddressMapper.INSTANCE.todto((Address) dao.findById(id));

        return addressdto;
    }

    public List<Addressdto> getAllActor() {
        return dao.getAll(Address.class).stream().map(address -> AddressMapper.INSTANCE.todto((Address) address))
                .toList();

    }

    public boolean updateActor(Addressdto addressdto) {
        Address address=AddressMapper.INSTANCE.toentity(addressdto);
        return dao.update(address);
    }

    public boolean deleteActor(int addressId) {
        return dao.delete(addressId);
    }

    public Addressdto AddActor(Addressdto addressdto) {
        return AddressMapper.INSTANCE.todto((Address) dao.insert(AddressMapper.INSTANCE.toentity(addressdto)));
    }

    public List<Addressdto> ActorsByName(String name) {
        return dao.findByName(name, Address.class).stream()
                .map(address -> AddressMapper.INSTANCE.todto((Address) address)).toList();
    }
}
