package gov.iti.jets.Mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Customerdto;
import gov.iti.jets.entity.Customer;
@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE=Mappers.getMapper(CustomerMapper.class);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Customerdto todto(Customer customer);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Customer toentity(Customerdto customerdto );
}
