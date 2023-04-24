package gov.iti.jets.Mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Staffdto;
import gov.iti.jets.entity.Staff;

@Mapper
public interface StaffMapper {
    StaffMapper INSTANCE=Mappers.getMapper(StaffMapper.class);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

    Staffdto todto(Staff staff);
    Staff toentity( Staffdto staffdto);
}
