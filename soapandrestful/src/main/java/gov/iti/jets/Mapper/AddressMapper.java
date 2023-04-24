package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Addressdto;
import gov.iti.jets.entity.Address;
@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);
    Addressdto todto(Address address);
    Address toentity(Addressdto addressdto);
    
}
