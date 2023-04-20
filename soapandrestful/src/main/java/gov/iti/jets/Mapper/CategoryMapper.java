package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Categorydto;
import gov.iti.jets.entity.Category;
@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE=Mappers.getMapper(CategoryMapper.class);
    Categorydto todto(Category category);
    Category toentity(Categorydto categorydto);
}
