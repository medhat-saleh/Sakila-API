package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Storedto;
import gov.iti.jets.entity.Store;

@Mapper
public interface StoreMapper {
 StoreMapper INSTANCE=Mappers.getMapper(StoreMapper.class);
 Storedto todto(Store store);
 Store toentity(Storedto storedto);   
}
