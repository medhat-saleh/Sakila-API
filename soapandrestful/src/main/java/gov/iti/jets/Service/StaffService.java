package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Staffdto;
import gov.iti.jets.Mapper.StaffMapper;
import gov.iti.jets.entity.Staff;

public class StaffService {
    GenericDao dao = new GenericDao<Staff>(Staff.class);

    public Staffdto getStafflById(int id) {
        Staffdto staffdto = StaffMapper.INSTANCE.todto((Staff) dao.findById(id));

        return staffdto;
    }

    public List<Staffdto> getAllStaff() {
        return dao.getAll(Staff.class).stream().map(staff -> StaffMapper.INSTANCE.todto((Staff) staff))
                .toList();

    }

    public boolean updateStaff(Staffdto staffdto) {
        Staff staff=StaffMapper.INSTANCE.toentity(staffdto);
        return dao.update( staff);
    }

    public boolean deleteStaff(int StafftId) {
        return dao.delete(StafftId);
    }

    public Staffdto AddStaff(Staffdto staffdto) {
        return StaffMapper.INSTANCE.todto((Staff) dao.insert(StaffMapper.INSTANCE.toentity(staffdto)));
    }

    public List<Staffdto> StaffByName(String name) {
        return dao.findByName(name, Staff.class).stream()
                .map(staff -> StaffMapper.INSTANCE.todto((Staff) staff)).toList();
    }   
}
