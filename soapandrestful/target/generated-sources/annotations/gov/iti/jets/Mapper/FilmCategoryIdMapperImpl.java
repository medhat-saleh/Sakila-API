package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.FilmCategoryIddto;
import gov.iti.jets.entity.FilmCategoryId;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T03:47:02+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
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
