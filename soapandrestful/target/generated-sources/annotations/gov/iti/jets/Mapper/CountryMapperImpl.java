package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Countrydto;
import gov.iti.jets.entity.Country;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-24T08:42:51+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class CountryMapperImpl implements CountryMapper {

    @Override
    public Countrydto todto(Country country) {
        if ( country == null ) {
            return null;
        }

        Countrydto countrydto = new Countrydto();

        countrydto.setCountryId( country.getCountryId() );
        countrydto.setCountry( country.getCountry() );
        countrydto.setLastUpdate( country.getLastUpdate() );

        return countrydto;
    }

    @Override
    public Country toentity(Countrydto countrydto) {
        if ( countrydto == null ) {
            return null;
        }

        Country country = new Country();

        country.setCountryId( countrydto.getCountryId() );
        country.setCountry( countrydto.getCountry() );
        country.setLastUpdate( countrydto.getLastUpdate() );

        return country;
    }
}
