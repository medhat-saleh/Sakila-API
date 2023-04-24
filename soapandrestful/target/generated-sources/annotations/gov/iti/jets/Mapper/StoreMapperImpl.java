package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Storedto;
import gov.iti.jets.entity.Store;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-24T08:42:51+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class StoreMapperImpl implements StoreMapper {

    @Override
    public Storedto todto(Store store) {
        if ( store == null ) {
            return null;
        }

        Storedto storedto = new Storedto();

        storedto.setStoreId( store.getStoreId() );
        storedto.setLastUpdate( store.getLastUpdate() );

        return storedto;
    }

    @Override
    public Store toentity(Storedto storedto) {
        if ( storedto == null ) {
            return null;
        }

        Store store = new Store();

        store.setStoreId( storedto.getStoreId() );
        store.setLastUpdate( storedto.getLastUpdate() );

        return store;
    }
}
