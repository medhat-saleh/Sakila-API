package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Filmdto;
import gov.iti.jets.DTOS.Languagedto;
import gov.iti.jets.entity.Film;
import gov.iti.jets.entity.Language;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-25T02:13:20+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class FilmMapperImpl implements FilmMapper {

    @Override
    public Filmdto todto(Film film) {
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

    @Override
    public Film toentity(Filmdto filmdto) {
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
}
