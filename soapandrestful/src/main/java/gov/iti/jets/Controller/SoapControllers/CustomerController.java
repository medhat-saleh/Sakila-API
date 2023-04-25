package gov.iti.jets.Controller.SoapControllers;

import java.util.List;
import gov.iti.jets.DTOS.Customerdto;
import gov.iti.jets.Service.CustomerService;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class CustomerController {
    CustomerService customerService = new CustomerService();


    public Customerdto getCustomerById( Short id) {
        
            Customerdto customerdto = customerService.getCustomerById(id);
            return customerdto;
       
    }

   
    public List<Customerdto> getAllCustomers() {
    
            List<Customerdto> customerdtos = customerService.getAllCustomers();
            
            return customerdtos;
         }

    public Customerdto addCustomer(Customerdto customerdto) {
       
        return customerService.AddCustomer(customerdto);
        
    }

    public boolean UpdateCustomer(Customerdto customerdto) {
    
            return customerService.updateCustomer(customerdto);
       
    }

    public boolean DeleteCustomerById(Short id) {
        
            return customerService.deleteCustomer(id);       
    }
}
