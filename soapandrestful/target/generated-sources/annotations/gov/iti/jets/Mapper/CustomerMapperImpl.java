package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Customerdto;
import gov.iti.jets.entity.Customer;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-25T02:13:21+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customerdto todto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        Customerdto customerdto = new Customerdto();

        customerdto.setCustomerId( customer.getCustomerId() );
        customerdto.setFirstName( customer.getFirstName() );
        customerdto.setLastName( customer.getLastName() );
        customerdto.setEmail( customer.getEmail() );
        customerdto.setActive( customer.isActive() );
        customerdto.setCreateDate( customer.getCreateDate() );
        customerdto.setLastUpdate( customer.getLastUpdate() );

        return customerdto;
    }

    @Override
    public Customer toentity(Customerdto customerdto) {
        if ( customerdto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCustomerId( customerdto.getCustomerId() );
        customer.setFirstName( customerdto.getFirstName() );
        customer.setLastName( customerdto.getLastName() );
        customer.setEmail( customerdto.getEmail() );
        customer.setActive( customerdto.isActive() );
        customer.setCreateDate( customerdto.getCreateDate() );
        customer.setLastUpdate( customerdto.getLastUpdate() );

        return customer;
    }
}
