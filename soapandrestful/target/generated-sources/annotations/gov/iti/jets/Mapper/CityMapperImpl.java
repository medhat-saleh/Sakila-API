package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Citydto;
import gov.iti.jets.entity.City;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-25T02:13:21+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class CityMapperImpl implements CityMapper {

    @Override
    public Citydto todto(City city) {
        if ( city == null ) {
            return null;
        }

        Citydto citydto = new Citydto();

        citydto.setCityId( city.getCityId() );
        citydto.setCity( city.getCity() );
        citydto.setLastUpdate( city.getLastUpdate() );

        return citydto;
    }

    @Override
    public City toentity(Citydto citydto) {
        if ( citydto == null ) {
            return null;
        }

        City city = new City();

        city.setCityId( citydto.getCityId() );
        city.setCity( citydto.getCity() );
        city.setLastUpdate( citydto.getLastUpdate() );

        return city;
    }
}
