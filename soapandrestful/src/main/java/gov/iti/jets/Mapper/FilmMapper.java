package gov.iti.jets.Mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Filmdto;
import gov.iti.jets.entity.Film;
@Mapper
public interface FilmMapper {
    FilmMapper INSTANCE=Mappers.getMapper(FilmMapper.class);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Filmdto todto(Film film);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Film toentity(Filmdto filmdto);

}
