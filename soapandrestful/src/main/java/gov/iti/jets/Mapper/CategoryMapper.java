package gov.iti.jets.Mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Categorydto;
import gov.iti.jets.entity.Category;
@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE=Mappers.getMapper(CategoryMapper.class);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Categorydto todto(Category category);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Category toentity(Categorydto categorydto);
}
