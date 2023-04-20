package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Paymentdto;
import gov.iti.jets.Mapper.PaymentMapper;
import gov.iti.jets.entity.Payment;

public class PaymentService {
    GenericDao dao = new GenericDao<Payment>(Payment.class);

    public Paymentdto getpaymentById(int id) {
        Paymentdto paymentdto = PaymentMapper.INSTANCE.todto((Payment) dao.findById(id));

        return paymentdto;
    }

    public List<Paymentdto> getAllpayment() {
        return dao.getAll(Payment.class).stream().map(payment -> PaymentMapper.INSTANCE.todto((Payment) payment))
                .toList();

    }

    public boolean updatepayment(Paymentdto paymentdto) {
        Payment payment=PaymentMapper.INSTANCE.toentity(paymentdto);
        return dao.update( payment);
    }

    public boolean deletepayment(int PaymentId) {
        return dao.delete(PaymentId);
    }

    public Paymentdto Addpayment(Paymentdto paymentdto) {
        return PaymentMapper.INSTANCE.todto((Payment) dao.insert(PaymentMapper.INSTANCE.toentity(paymentdto)));
    }

    public List<Paymentdto> paymentByName(String name) {
        return dao.findByName(name, Payment.class).stream()
                .map(payment -> PaymentMapper.INSTANCE.todto((Payment) payment)).toList();
    }
}
