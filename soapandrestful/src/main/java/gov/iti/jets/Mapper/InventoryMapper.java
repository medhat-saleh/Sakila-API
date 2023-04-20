package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Inventorydto;
import gov.iti.jets.entity.Inventory;

@Mapper
public interface InventoryMapper {
    InventoryMapper INSTANCE = Mappers.getMapper(InventoryMapper.class);

    Inventorydto todto(Inventory inventory);

    Inventory toentity(Inventorydto inventorydto);

}
