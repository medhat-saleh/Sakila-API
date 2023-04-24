package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Paymentdto;
import gov.iti.jets.entity.Payment;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-24T08:42:51+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class PaymentMapperImpl implements PaymentMapper {

    @Override
    public Paymentdto todto(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        Paymentdto paymentdto = new Paymentdto();

        paymentdto.setPaymentId( payment.getPaymentId() );
        paymentdto.setAmount( payment.getAmount() );
        paymentdto.setPaymentDate( payment.getPaymentDate() );
        paymentdto.setLastUpdate( payment.getLastUpdate() );

        return paymentdto;
    }

    @Override
    public Payment toentity(Paymentdto paymentdto) {
        if ( paymentdto == null ) {
            return null;
        }

        Payment payment = new Payment();

        payment.setPaymentId( paymentdto.getPaymentId() );
        payment.setAmount( paymentdto.getAmount() );
        payment.setPaymentDate( paymentdto.getPaymentDate() );
        payment.setLastUpdate( paymentdto.getLastUpdate() );

        return payment;
    }
}
