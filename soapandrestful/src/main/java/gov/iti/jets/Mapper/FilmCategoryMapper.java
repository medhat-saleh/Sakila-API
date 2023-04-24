package gov.iti.jets.Mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;
import gov.iti.jets.DTOS.FilmCategorydto;
import gov.iti.jets.entity.FilmCategory;

@Mapper
public interface FilmCategoryMapper {

    FilmCategoryMapper INSTANCE=Mappers.getMapper(FilmCategoryMapper.class);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    FilmCategorydto todto(FilmCategory filmActorId);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    FilmCategory toentity(FilmCategorydto categorydto);
}
