package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Addressdto;
import gov.iti.jets.DTOS.Citydto;
import gov.iti.jets.entity.Address;
import gov.iti.jets.entity.City;
import java.util.Arrays;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-24T08:42:51+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Addressdto todto(Address address) {
        if ( address == null ) {
            return null;
        }

        Addressdto addressdto = new Addressdto();

        addressdto.setAddressId( address.getAddressId() );
        addressdto.setCity( cityToCitydto( address.getCity() ) );
        addressdto.setAddress( address.getAddress() );
        addressdto.setAddress2( address.getAddress2() );
        addressdto.setDistrict( address.getDistrict() );
        addressdto.setPostalCode( address.getPostalCode() );
        addressdto.setPhone( address.getPhone() );
        byte[] location = address.getLocation();
        if ( location != null ) {
            addressdto.setLocation( Arrays.copyOf( location, location.length ) );
        }
        addressdto.setLastUpdate( address.getLastUpdate() );

        return addressdto;
    }

    @Override
    public Address toentity(Addressdto addressdto) {
        if ( addressdto == null ) {
            return null;
        }

        Address address = new Address();

        address.setAddressId( addressdto.getAddressId() );
        address.setCity( citydtoToCity( addressdto.getCity() ) );
        address.setAddress( addressdto.getAddress() );
        address.setAddress2( addressdto.getAddress2() );
        address.setDistrict( addressdto.getDistrict() );
        address.setPostalCode( addressdto.getPostalCode() );
        address.setPhone( addressdto.getPhone() );
        byte[] location = addressdto.getLocation();
        if ( location != null ) {
            address.setLocation( Arrays.copyOf( location, location.length ) );
        }
        address.setLastUpdate( addressdto.getLastUpdate() );

        return address;
    }

    protected Citydto cityToCitydto(City city) {
        if ( city == null ) {
            return null;
        }

        Citydto citydto = new Citydto();

        citydto.setCityId( city.getCityId() );
        citydto.setCity( city.getCity() );
        citydto.setLastUpdate( city.getLastUpdate() );

        return citydto;
    }

    protected City citydtoToCity(Citydto citydto) {
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
