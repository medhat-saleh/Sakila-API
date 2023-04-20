package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Rentaldto;
import gov.iti.jets.Mapper.RentalMapper;
import gov.iti.jets.entity.Rental;

public class RentalService {
    GenericDao dao = new GenericDao<Rental>(Rental.class);

    public Rentaldto getRentalById(int id) {
        Rentaldto rentaldto = RentalMapper.INSTANCE.todto((Rental) dao.findById(id));

        return rentaldto;
    }

    public List<Rentaldto> getAllRentals() {
        return dao.getAll(Rental.class).stream().map(rental -> RentalMapper.INSTANCE.todto((Rental) rental))
                .toList();

    }

    public boolean updateRental(Rentaldto rentaldto) {
        Rental rental=RentalMapper.INSTANCE.toentity(rentaldto);
        return dao.update( rental);
    }

    public boolean deleteRental(int RentaltId) {
        return dao.delete(RentaltId);
    }

    public Rentaldto AddRental(Rentaldto rentaldto) {
        return RentalMapper.INSTANCE.todto((Rental) dao.insert(RentalMapper.INSTANCE.toentity(rentaldto)));
    }

    public List<Rentaldto> RentalByName(String name) {
        return dao.findByName(name, Rental.class).stream()
                .map(rental -> RentalMapper.INSTANCE.todto((Rental) rental)).toList();
    }
}
