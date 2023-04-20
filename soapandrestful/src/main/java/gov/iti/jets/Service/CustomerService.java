package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Customerdto;
import gov.iti.jets.Mapper.CustomerMapper;
import gov.iti.jets.entity.Customer;

public class CustomerService {
    GenericDao dao = new GenericDao<Customer>(Customer.class);

    public Customerdto getCustomerById(int id) {
        Customerdto customerdto = CustomerMapper.INSTANCE.todto((Customer) dao.findById(id));

        return customerdto;
    }

    public List<Customerdto> getAllCustomers() {
        return dao.getAll(Customer.class).stream().map(customer -> CustomerMapper.INSTANCE.todto((Customer) customer))
                .toList();

    }

    public boolean updateCustomer(Customerdto customerdto) {
        Customer customer=CustomerMapper.INSTANCE.toentity(customerdto);
        return dao.update( customer);
    }

    public boolean deleteCustomer(int CustomerId) {
        return dao.delete(CustomerId);
    }

    public Customerdto AddCustomer(Customerdto customerdto) {
        return CustomerMapper.INSTANCE.todto((Customer) dao.insert(CustomerMapper.INSTANCE.toentity(customerdto)));
    }

    public List<Customerdto> CustomerByName(String name) {
        return dao.findByName(name, Customer.class).stream()
                .map(customer -> CustomerMapper.INSTANCE.todto((Customer) customer)).toList();
    }
}
