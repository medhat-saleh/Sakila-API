package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.FilmCategoryIddto;
import gov.iti.jets.entity.FilmCategoryId;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-24T08:42:51+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class FilmCategoryIdMapperImpl implements FilmCategoryIdMapper {

    @Override
    public FilmCategoryIddto todto(FilmCategoryId object) {
        if ( object == null ) {
            return null;
        }

        FilmCategoryIddto filmCategoryIddto = new FilmCategoryIddto();

        filmCategoryIddto.setCategoryId( object.getCategoryId() );
        filmCategoryIddto.setFilmId( object.getFilmId() );

        return filmCategoryIddto;
    }

    @Override
    public FilmCategoryId toentity(FilmCategoryIddto actordto) {
        if ( actordto == null ) {
            return null;
        }

        FilmCategoryId filmCategoryId = new FilmCategoryId();

        filmCategoryId.setCategoryId( actordto.getCategoryId() );
        filmCategoryId.setFilmId( actordto.getFilmId() );

        return filmCategoryId;
    }
}
