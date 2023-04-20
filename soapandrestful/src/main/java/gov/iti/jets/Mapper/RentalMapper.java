package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Rentaldto;
import gov.iti.jets.entity.Rental;
@Mapper
public interface RentalMapper {
    RentalMapper INSTANCE=Mappers.getMapper(RentalMapper.class);
    Rentaldto todto(Rental rental);
    Rental toentity(Rentaldto rentaldto);
}
