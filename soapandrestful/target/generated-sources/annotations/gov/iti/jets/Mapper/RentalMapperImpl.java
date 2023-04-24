package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Rentaldto;
import gov.iti.jets.entity.Rental;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-24T08:42:51+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class RentalMapperImpl implements RentalMapper {

    @Override
    public Rentaldto todto(Rental rental) {
        if ( rental == null ) {
            return null;
        }

        Rentaldto rentaldto = new Rentaldto();

        rentaldto.setRentalId( rental.getRentalId() );
        rentaldto.setRentalDate( rental.getRentalDate() );
        rentaldto.setReturnDate( rental.getReturnDate() );
        rentaldto.setLastUpdate( rental.getLastUpdate() );

        return rentaldto;
    }

    @Override
    public Rental toentity(Rentaldto rentaldto) {
        if ( rentaldto == null ) {
            return null;
        }

        Rental rental = new Rental();

        rental.setRentalId( rentaldto.getRentalId() );
        rental.setRentalDate( rentaldto.getRentalDate() );
        rental.setReturnDate( rentaldto.getReturnDate() );
        rental.setLastUpdate( rentaldto.getLastUpdate() );

        return rental;
    }
}
