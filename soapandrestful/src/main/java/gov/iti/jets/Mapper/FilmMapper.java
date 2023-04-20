package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Filmdto;
import gov.iti.jets.entity.Film;
@Mapper
public interface FilmMapper {
    FilmMapper INSTANCE=Mappers.getMapper(FilmMapper.class);
    Filmdto todto(Film film);
    Film toentity(Filmdto filmdto);

}
