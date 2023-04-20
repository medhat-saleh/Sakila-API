package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Staffdto;
import gov.iti.jets.entity.Staff;

@Mapper
public interface StaffMapper {
    StaffMapper INSTANCE=Mappers.getMapper(StaffMapper.class);
    Staffdto todto(Staff staff);
    Staff toentity( Staffdto staffdto);
}
