package gov.iti.jets.Mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Storedto;
import gov.iti.jets.entity.Store;

@Mapper
public interface StoreMapper {
 StoreMapper INSTANCE=Mappers.getMapper(StoreMapper.class);
 @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
 Storedto todto(Store store);
 Store toentity(Storedto storedto);   
}
