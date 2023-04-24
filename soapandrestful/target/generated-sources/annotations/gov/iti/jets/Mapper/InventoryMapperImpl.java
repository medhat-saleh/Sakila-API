package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Filmdto;
import gov.iti.jets.DTOS.Inventorydto;
import gov.iti.jets.DTOS.Languagedto;
import gov.iti.jets.DTOS.Storedto;
import gov.iti.jets.entity.Film;
import gov.iti.jets.entity.Inventory;
import gov.iti.jets.entity.Language;
import gov.iti.jets.entity.Store;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-24T08:42:51+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class InventoryMapperImpl implements InventoryMapper {

    @Override
    public Inventorydto todto(Inventory inventory) {
        if ( inventory == null ) {
            return null;
        }

        Inventorydto inventorydto = new Inventorydto();

        inventorydto.setInventoryId( inventory.getInventoryId() );
        inventorydto.setStore( storeToStoredto( inventory.getStore() ) );
        inventorydto.setFilm( filmToFilmdto( inventory.getFilm() ) );
        inventorydto.setLastUpdate( inventory.getLastUpdate() );

        return inventorydto;
    }

    @Override
    public Inventory toentity(Inventorydto inventorydto) {
        if ( inventorydto == null ) {
            return null;
        }

        Inventory inventory = new Inventory();

        inventory.setInventoryId( inventorydto.getInventoryId() );
        inventory.setStore( storedtoToStore( inventorydto.getStore() ) );
        inventory.setFilm( filmdtoToFilm( inventorydto.getFilm() ) );
        inventory.setLastUpdate( inventorydto.getLastUpdate() );

        return inventory;
    }

    protected Storedto storeToStoredto(Store store) {
        if ( store == null ) {
            return null;
        }

        Storedto storedto = new Storedto();

        storedto.setStoreId( store.getStoreId() );
        storedto.setLastUpdate( store.getLastUpdate() );

        return storedto;
    }

    protected Languagedto languageToLanguagedto(Language language) {
        if ( language == null ) {
            return null;
        }

        Languagedto languagedto = new Languagedto();

        languagedto.setLanguageId( language.getLanguageId() );
        languagedto.setName( language.getName() );
        languagedto.setLastUpdate( language.getLastUpdate() );

        return languagedto;
    }

    protected Filmdto filmToFilmdto(Film film) {
        if ( film == null ) {
            return null;
        }

        Filmdto filmdto = new Filmdto();

        filmdto.setFilmId( film.getFilmId() );
        filmdto.setLanguageByLanguageId( languageToLanguagedto( film.getLanguageByLanguageId() ) );
        filmdto.setLanguageByOriginalLanguageId( languageToLanguagedto( film.getLanguageByOriginalLanguageId() ) );
        filmdto.setTitle( film.getTitle() );
        filmdto.setDescription( film.getDescription() );
        filmdto.setReleaseYear( film.getReleaseYear() );
        filmdto.setRentalDuration( film.getRentalDuration() );
        filmdto.setRentalRate( film.getRentalRate() );
        filmdto.setLength( film.getLength() );
        filmdto.setReplacementCost( film.getReplacementCost() );
        filmdto.setRating( film.getRating() );
        filmdto.setSpecialFeatures( film.getSpecialFeatures() );
        filmdto.setLastUpdate( film.getLastUpdate() );

        return filmdto;
    }

    protected Store storedtoToStore(Storedto storedto) {
        if ( storedto == null ) {
            return null;
        }

        Store store = new Store();

        store.setStoreId( storedto.getStoreId() );
        store.setLastUpdate( storedto.getLastUpdate() );

        return store;
    }

    protected Language languagedtoToLanguage(Languagedto languagedto) {
        if ( languagedto == null ) {
            return null;
        }

        Language language = new Language();

        language.setLanguageId( languagedto.getLanguageId() );
        language.setName( languagedto.getName() );
        language.setLastUpdate( languagedto.getLastUpdate() );

        return language;
    }

    protected Film filmdtoToFilm(Filmdto filmdto) {
        if ( filmdto == null ) {
            return null;
        }

        Film film = new Film();

        film.setFilmId( filmdto.getFilmId() );
        film.setLanguageByLanguageId( languagedtoToLanguage( filmdto.getLanguageByLanguageId() ) );
        film.setLanguageByOriginalLanguageId( languagedtoToLanguage( filmdto.getLanguageByOriginalLanguageId() ) );
        film.setTitle( filmdto.getTitle() );
        film.setDescription( filmdto.getDescription() );
        film.setReleaseYear( filmdto.getReleaseYear() );
        film.setRentalDuration( filmdto.getRentalDuration() );
        film.setRentalRate( filmdto.getRentalRate() );
        film.setLength( filmdto.getLength() );
        film.setReplacementCost( filmdto.getReplacementCost() );
        film.setRating( filmdto.getRating() );
        film.setSpecialFeatures( filmdto.getSpecialFeatures() );
        film.setLastUpdate( filmdto.getLastUpdate() );

        return film;
    }
}
