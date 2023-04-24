package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Customerdto;
import gov.iti.jets.Mapper.AddressMapper;
import gov.iti.jets.Mapper.CustomerMapper;
import gov.iti.jets.Mapper.StoreMapper;
import gov.iti.jets.entity.Customer;

public class CustomerService {
    GenericDao dao = new GenericDao<Customer>(Customer.class);

    public Customerdto getCustomerById(int id) {
        Customer customer=(Customer) dao.findById(id);

        Customerdto customerdto = CustomerMapper.INSTANCE.todto(customer);
        customerdto.setAddressdto(AddressMapper.INSTANCE.todto(customer.getAddress()));
customerdto.setStoredto(StoreMapper.INSTANCE.todto(customer.getStore()));
        return customerdto;
    }

    public List<Customerdto> getAllCustomers() {
        return dao.getAll(Customer.class).stream().map(customer -> CustomerMapper.INSTANCE.todto((Customer) customer))
                .toList();

    }

    public boolean updateCustomer(Customerdto customerdto) {
        Customer customer=(Customer)CustomerMapper.INSTANCE.toentity(customerdto);
        customer.setAddress(AddressMapper.INSTANCE.toentity(customerdto.getAddressdto()));
        customer.setStore(StoreMapper.INSTANCE.toentity(customerdto.getStoredto()));
        return dao.update( customer);
    }

    public boolean deleteCustomer(int CustomerId) {
        return dao.delete(CustomerId);
    }

    public Customerdto AddCustomer(Customerdto customerdto) {
        Customer customer=(Customer)CustomerMapper.INSTANCE.toentity(customerdto);
        customer.setAddress(AddressMapper.INSTANCE.toentity(customerdto.getAddressdto()));
        customer.setStore(StoreMapper.INSTANCE.toentity(customerdto.getStoredto()));

        return CustomerMapper.INSTANCE.todto((Customer)dao.insert(customer));
    }

    
}
