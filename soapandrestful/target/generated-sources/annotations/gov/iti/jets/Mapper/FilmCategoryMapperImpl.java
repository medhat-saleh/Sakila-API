package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Categorydto;
import gov.iti.jets.DTOS.FilmCategoryIddto;
import gov.iti.jets.DTOS.FilmCategorydto;
import gov.iti.jets.DTOS.Filmdto;
import gov.iti.jets.DTOS.Languagedto;
import gov.iti.jets.entity.Category;
import gov.iti.jets.entity.Film;
import gov.iti.jets.entity.FilmCategory;
import gov.iti.jets.entity.FilmCategoryId;
import gov.iti.jets.entity.Language;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-24T08:42:51+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class FilmCategoryMapperImpl implements FilmCategoryMapper {

    @Override
    public FilmCategorydto todto(FilmCategory filmActorId) {
        if ( filmActorId == null ) {
            return null;
        }

        FilmCategorydto filmCategorydto = new FilmCategorydto();

        filmCategorydto.setId( filmCategoryIdToFilmCategoryIddto( filmActorId.getId() ) );
        filmCategorydto.setCategory( categoryToCategorydto( filmActorId.getCategory() ) );
        filmCategorydto.setFilm( filmToFilmdto( filmActorId.getFilm() ) );
        filmCategorydto.setLastUpdate( filmActorId.getLastUpdate() );

        return filmCategorydto;
    }

    @Override
    public FilmCategory toentity(FilmCategorydto categorydto) {
        if ( categorydto == null ) {
            return null;
        }

        FilmCategory filmCategory = new FilmCategory();

        filmCategory.setId( filmCategoryIddtoToFilmCategoryId( categorydto.getId() ) );
        filmCategory.setCategory( categorydtoToCategory( categorydto.getCategory() ) );
        filmCategory.setFilm( filmdtoToFilm( categorydto.getFilm() ) );
        filmCategory.setLastUpdate( categorydto.getLastUpdate() );

        return filmCategory;
    }

    protected FilmCategoryIddto filmCategoryIdToFilmCategoryIddto(FilmCategoryId filmCategoryId) {
        if ( filmCategoryId == null ) {
            return null;
        }

        FilmCategoryIddto filmCategoryIddto = new FilmCategoryIddto();

        filmCategoryIddto.setCategoryId( filmCategoryId.getCategoryId() );
        filmCategoryIddto.setFilmId( filmCategoryId.getFilmId() );

        return filmCategoryIddto;
    }

    protected Categorydto categoryToCategorydto(Category category) {
        if ( category == null ) {
            return null;
        }

        Categorydto categorydto = new Categorydto();

        categorydto.setCategoryId( category.getCategoryId() );
        categorydto.setName( category.getName() );
        categorydto.setLastUpdate( category.getLastUpdate() );

        return categorydto;
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

    protected FilmCategoryId filmCategoryIddtoToFilmCategoryId(FilmCategoryIddto filmCategoryIddto) {
        if ( filmCategoryIddto == null ) {
            return null;
        }

        FilmCategoryId filmCategoryId = new FilmCategoryId();

        filmCategoryId.setCategoryId( filmCategoryIddto.getCategoryId() );
        filmCategoryId.setFilmId( filmCategoryIddto.getFilmId() );

        return filmCategoryId;
    }

    protected Category categorydtoToCategory(Categorydto categorydto) {
        if ( categorydto == null ) {
            return null;
        }

        Category category = new Category();

        category.setCategoryId( categorydto.getCategoryId() );
        category.setName( categorydto.getName() );
        category.setLastUpdate( categorydto.getLastUpdate() );

        return category;
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
