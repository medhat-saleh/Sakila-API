package gov.iti.jets.Service;

import java.util.List;

import org.glassfish.jersey.internal.inject.Custom;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Paymentdto;
import gov.iti.jets.Mapper.CustomerMapper;
import gov.iti.jets.Mapper.PaymentMapper;
import gov.iti.jets.Mapper.RentalMapper;
import gov.iti.jets.Mapper.StaffMapper;
import gov.iti.jets.entity.Payment;

public class PaymentService {
    GenericDao dao = new GenericDao<Payment>(Payment.class);

    public Paymentdto getpaymentById(int id) {
        Payment payment=(Payment) dao.findById(id);
        Paymentdto paymentdto = PaymentMapper.INSTANCE.todto(payment);
        paymentdto.setCustomerdto(CustomerMapper.INSTANCE.todto(payment.getCustomer()));
        paymentdto.setRentaldto(RentalMapper.INSTANCE.todto(payment.getRental()));
        paymentdto.setStaffdto(StaffMapper.INSTANCE.todto(payment.getStaff()));

        return paymentdto;
    }

    public List<Paymentdto> getAllpayment() {
        return dao.getAll(Payment.class).stream().map(payment -> PaymentMapper.INSTANCE.todto((Payment) payment))
                .toList();

    }

    public boolean updatepayment(Paymentdto paymentdto) {
        Payment payment=PaymentMapper.INSTANCE.toentity(paymentdto);
        payment.setCustomer(CustomerMapper.INSTANCE.toentity(paymentdto.getCustomerdto()));
        payment.setRental(RentalMapper.INSTANCE.toentity(paymentdto.getRentaldto()));
        payment.setStaff(StaffMapper.INSTANCE.toentity(paymentdto.getStaffdto()));
       
        return dao.update( payment);
    }

    public boolean deletepayment(int PaymentId) {
        return dao.delete(PaymentId);
    }

    public Paymentdto Addpayment(Paymentdto paymentdto) {
        Payment payment=PaymentMapper.INSTANCE.toentity(paymentdto);
        payment.setCustomer(CustomerMapper.INSTANCE.toentity(paymentdto.getCustomerdto()));
        payment.setRental(RentalMapper.INSTANCE.toentity(paymentdto.getRentaldto()));
        payment.setStaff(StaffMapper.INSTANCE.toentity(paymentdto.getStaffdto()));
        return PaymentMapper.INSTANCE.todto((Payment) dao.insert(payment));
    }

    
}
