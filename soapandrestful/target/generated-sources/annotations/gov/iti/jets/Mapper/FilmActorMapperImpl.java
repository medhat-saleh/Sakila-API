package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.ActorDTO.Actordto;
import gov.iti.jets.DTOS.FilmActordto;
import gov.iti.jets.DTOS.Filmdto;
import gov.iti.jets.DTOS.Languagedto;
import gov.iti.jets.entity.Actor;
import gov.iti.jets.entity.Film;
import gov.iti.jets.entity.FilmActor;
import gov.iti.jets.entity.Language;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-24T08:42:51+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class FilmActorMapperImpl implements FilmActorMapper {

    @Override
    public FilmActordto todto(FilmActor object) {
        if ( object == null ) {
            return null;
        }

        FilmActordto filmActordto = new FilmActordto();

        filmActordto.setId( object.getId() );
        filmActordto.setActor( actorToActordto( object.getActor() ) );
        filmActordto.setFilm( filmToFilmdto( object.getFilm() ) );
        filmActordto.setLastUpdate( object.getLastUpdate() );

        return filmActordto;
    }

    @Override
    public FilmActor toentity(FilmActordto actordto) {
        if ( actordto == null ) {
            return null;
        }

        FilmActor filmActor = new FilmActor();

        filmActor.setId( actordto.getId() );
        filmActor.setActor( actordtoToActor( actordto.getActor() ) );
        filmActor.setFilm( filmdtoToFilm( actordto.getFilm() ) );
        filmActor.setLastUpdate( actordto.getLastUpdate() );

        return filmActor;
    }

    protected Actordto actorToActordto(Actor actor) {
        if ( actor == null ) {
            return null;
        }

        Actordto actordto = new Actordto();

        actordto.setActorId( actor.getActorId() );
        actordto.setFirstName( actor.getFirstName() );
        actordto.setLastName( actor.getLastName() );
        actordto.setLastUpdate( actor.getLastUpdate() );

        return actordto;
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

    protected Actor actordtoToActor(Actordto actordto) {
        if ( actordto == null ) {
            return null;
        }

        Actor actor = new Actor();

        actor.setActorId( actordto.getActorId() );
        actor.setFirstName( actordto.getFirstName() );
        actor.setLastName( actordto.getLastName() );
        actor.setLastUpdate( actordto.getLastUpdate() );

        return actor;
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
