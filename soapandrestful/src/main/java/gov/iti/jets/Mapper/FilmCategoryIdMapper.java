package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.FilmCategoryIddto;
import gov.iti.jets.entity.FilmCategoryId;

@Mapper
public interface FilmCategoryIdMapper {
    FilmCategoryIdMapper INSTANCE = Mappers.getMapper(FilmCategoryIdMapper.class);
    public FilmCategoryIddto todto(FilmCategoryId object );
    public FilmCategoryId toentity(FilmCategoryIddto actordto);
}
