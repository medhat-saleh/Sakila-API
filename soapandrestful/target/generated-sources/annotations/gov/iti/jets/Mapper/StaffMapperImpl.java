package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Staffdto;
import gov.iti.jets.entity.Staff;
import java.util.Arrays;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-24T08:42:51+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class StaffMapperImpl implements StaffMapper {

    @Override
    public Staffdto todto(Staff staff) {
        if ( staff == null ) {
            return null;
        }

        Staffdto staffdto = new Staffdto();

        staffdto.setStaffId( staff.getStaffId() );
        staffdto.setFirstName( staff.getFirstName() );
        staffdto.setLastName( staff.getLastName() );
        byte[] picture = staff.getPicture();
        if ( picture != null ) {
            staffdto.setPicture( Arrays.copyOf( picture, picture.length ) );
        }
        staffdto.setEmail( staff.getEmail() );
        staffdto.setActive( staff.isActive() );
        staffdto.setUsername( staff.getUsername() );
        staffdto.setLastUpdate( staff.getLastUpdate() );

        return staffdto;
    }

    @Override
    public Staff toentity(Staffdto staffdto) {
        if ( staffdto == null ) {
            return null;
        }

        Staff staff = new Staff();

        staff.setStaffId( staffdto.getStaffId() );
        staff.setFirstName( staffdto.getFirstName() );
        staff.setLastName( staffdto.getLastName() );
        byte[] picture = staffdto.getPicture();
        if ( picture != null ) {
            staff.setPicture( Arrays.copyOf( picture, picture.length ) );
        }
        staff.setEmail( staffdto.getEmail() );
        staff.setActive( staffdto.isActive() );
        staff.setUsername( staffdto.getUsername() );
        staff.setLastUpdate( staffdto.getLastUpdate() );

        return staff;
    }
}
