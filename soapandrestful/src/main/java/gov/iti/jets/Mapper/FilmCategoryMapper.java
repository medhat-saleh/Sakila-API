package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import gov.iti.jets.DTOS.FilmCategorydto;
import gov.iti.jets.entity.FilmCategory;

@Mapper
public interface FilmCategoryMapper {
    FilmCategoryMapper INSTANCE=Mappers.getMapper(FilmCategoryMapper.class);
    FilmCategorydto todto(FilmCategory filmActorId);
    FilmCategory toentity(FilmCategorydto categorydto);
}
