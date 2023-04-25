package gov.iti.jets.Controller.SoapControllers;

import java.util.List;
import gov.iti.jets.DTOS.Staffdto;
import gov.iti.jets.Service.StaffService;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class StaffController {
    StaffService staffService = new StaffService();

    public Staffdto getStaffById(Short id) {

        Staffdto staffdto = staffService.getStafflById(id);
        return staffdto;

    }

    public List<Staffdto> getAllStaffs() {

        List<Staffdto> staffdtos = staffService.getAllStaff();

        return staffdtos;
    }

    public Staffdto addStaff(Staffdto staffdto) {

        return staffService.AddStaff(staffdto);
    }

    public boolean UpdateStaff(Staffdto staffdto) {

        return staffService.updateStaff(staffdto);

    }

    public boolean DeleteStaffById(Short id) {

        return staffService.deleteStaff(id);

    }

}
