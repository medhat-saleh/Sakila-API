package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Customerdto;
import gov.iti.jets.entity.Customer;
@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE=Mappers.getMapper(CustomerMapper.class);
    Customerdto todto(Customer customer);
    Customer toentity(Customerdto customerdto );
}
