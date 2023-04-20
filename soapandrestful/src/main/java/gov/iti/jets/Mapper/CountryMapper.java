package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Countrydto;
import gov.iti.jets.entity.Country;

@Mapper
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    Countrydto todto(Country country);

    Country toentity(Countrydto countrydto);

}
