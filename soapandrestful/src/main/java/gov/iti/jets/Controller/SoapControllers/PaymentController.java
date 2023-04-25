package gov.iti.jets.Controller.SoapControllers;

import java.util.List;
import gov.iti.jets.DTOS.Paymentdto;
import gov.iti.jets.Service.PaymentService;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class PaymentController {
    PaymentService  paymentService= new PaymentService();

    public Paymentdto getStaffById(Short id) {
        
        Paymentdto paymentdto = paymentService.getpaymentById(id);
            return paymentdto;
        
    }

    public List<Paymentdto> getAllStaffs() {
    
            List<Paymentdto> paymentdtos = paymentService.getAllpayment();
            return paymentdtos;
    
    }
    public Paymentdto addStaff(Paymentdto paymentdto) {
            return paymentService.Addpayment(paymentdto);
    
    }

    public boolean UpdateStaff(Paymentdto paymentdto ) {
    
            return paymentService.updatepayment(paymentdto);
    
    }

    public boolean DeleteStaffById( Short id) {
        
            return paymentService.deletepayment(id);
        }
    
}
