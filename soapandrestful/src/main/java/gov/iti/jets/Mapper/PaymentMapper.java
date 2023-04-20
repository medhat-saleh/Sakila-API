package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Paymentdto;
import gov.iti.jets.entity.Payment;
@Mapper
public interface PaymentMapper {
    PaymentMapper INSTANCE=Mappers.getMapper(PaymentMapper.class);
    Paymentdto todto(Payment payment);
    Payment toentity(Paymentdto paymentdto);
}
