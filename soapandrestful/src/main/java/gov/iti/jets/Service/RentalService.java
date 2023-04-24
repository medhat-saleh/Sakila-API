package gov.iti.jets.Service;

import java.util.List;
import java.util.Set;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Inventorydto;
import gov.iti.jets.DTOS.Rentaldto;
import gov.iti.jets.Mapper.CustomerMapper;
import gov.iti.jets.Mapper.InventoryMapper;
import gov.iti.jets.Mapper.PaymentMapper;
import gov.iti.jets.Mapper.RentalMapper;
import gov.iti.jets.Mapper.StaffMapper;
import gov.iti.jets.entity.Rental;
import gov.iti.jets.entity.Staff;

public class RentalService {
    GenericDao dao = new GenericDao<Rental>(Rental.class);

    public Rentaldto getRentalById(int id) {
        Rental rental=(Rental) dao.findById(id);

        Rentaldto rentaldto = RentalMapper.INSTANCE.todto(rental);
        rentaldto.setCustomerdto(CustomerMapper.INSTANCE.todto(rental.getCustomer()));
        rentaldto.setInventorydto(InventoryMapper.INSTANCE.todto(rental.getInventory()));
        rentaldto.setStaffdto(StaffMapper.INSTANCE.todto(rental.getStaff()));
        rentaldto.setPaymentdtos(rental.getPayments().stream().map(paymen->PaymentMapper.INSTANCE.todto(paymen)).toList());

        return rentaldto;
    }

    public List<Rentaldto> getAllRentals() {
        return dao.getAll(Rental.class).stream().map(rental -> RentalMapper.INSTANCE.todto((Rental) rental))
                .toList();

    }

    public boolean updateRental(Rentaldto rentaldto) {
        Rental rental=RentalMapper.INSTANCE.toentity(rentaldto);
        rental.setCustomer(CustomerMapper.INSTANCE.toentity(rentaldto.getCustomerdto()));
        rental.setInventory(InventoryMapper.INSTANCE.toentity(rentaldto.getInventorydto()));
        rental.setStaff(StaffMapper.INSTANCE.toentity(rentaldto.getStaffdto()));
        rental.setPayments((Set)rentaldto.getPaymentdtos().stream().map(payment->PaymentMapper.INSTANCE.toentity(payment)).toList());
       
        return dao.update( rental);
    }

    public boolean deleteRental(int RentaltId) {
        return dao.delete(RentaltId);
    }

    public Rentaldto AddRental(Rentaldto rentaldto) {

        Rental rental=RentalMapper.INSTANCE.toentity(rentaldto);
        rental.setCustomer(CustomerMapper.INSTANCE.toentity(rentaldto.getCustomerdto()));
        rental.setInventory(InventoryMapper.INSTANCE.toentity(rentaldto.getInventorydto()));
        rental.setStaff(StaffMapper.INSTANCE.toentity(rentaldto.getStaffdto()));
        rental.setPayments((Set)rentaldto.getPaymentdtos().stream().map(payment->PaymentMapper.INSTANCE.toentity(payment)).toList());
        return RentalMapper.INSTANCE.todto((Rental) dao.insert(rental));
    }

   
}
