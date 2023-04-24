package gov.iti.jets.Mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Rentaldto;
import gov.iti.jets.entity.Rental;
@Mapper
public interface RentalMapper {
    RentalMapper INSTANCE=Mappers.getMapper(RentalMapper.class);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Rentaldto todto(Rental rental);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Rental toentity(Rentaldto rentaldto);
}
