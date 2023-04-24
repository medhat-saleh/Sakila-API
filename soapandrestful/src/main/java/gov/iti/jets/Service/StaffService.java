package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Staffdto;
import gov.iti.jets.Mapper.AddressMapper;
import gov.iti.jets.Mapper.StaffMapper;
import gov.iti.jets.Mapper.StoreMapper;
import gov.iti.jets.entity.Staff;

public class StaffService {
    GenericDao dao = new GenericDao<Staff>(Staff.class);

    public Staffdto getStafflById(int id) {
        Staff staff=(Staff) dao.findById(id);
        Staffdto staffdto = StaffMapper.INSTANCE.todto(staff);
        staffdto.setAddressdto(AddressMapper.INSTANCE.todto(staff.getAddress()));
        staffdto.setStoredto(StoreMapper.INSTANCE.todto(staff.getStore()));

        return staffdto;
    }

    public List<Staffdto> getAllStaff() {
        return dao.getAll(Staff.class).stream().map(staff -> StaffMapper.INSTANCE.todto((Staff) staff))
                .toList();

    }

    public boolean updateStaff(Staffdto staffdto) {
    
        Staff staff=StaffMapper.INSTANCE.toentity(staffdto);
        staff.setAddress(AddressMapper.INSTANCE.toentity(staffdto.getAddressdto()));
        staff.setStore(StoreMapper.INSTANCE.toentity(staffdto.getStoredto()));
        return dao.update( staff);
    }

    public boolean deleteStaff(int StafftId) {
        return dao.delete(StafftId);
    }

    public Staffdto AddStaff(Staffdto staffdto) {
        Staff staff=StaffMapper.INSTANCE.toentity(staffdto);
        staff.setAddress(AddressMapper.INSTANCE.toentity(staffdto.getAddressdto()));
        staff.setStore(StoreMapper.INSTANCE.toentity(staffdto.getStoredto()));

        return StaffMapper.INSTANCE.todto((Staff) dao.insert(staff));
    }

    
}
