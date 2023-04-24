package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.FilmActorIddto;
import gov.iti.jets.entity.FilmActorId;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-24T08:42:51+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class FilmActorIdMapperImpl implements FilmActorIdMapper {

    @Override
    public FilmActorIddto todto(FilmActorId object) {
        if ( object == null ) {
            return null;
        }

        FilmActorIddto filmActorIddto = new FilmActorIddto();

        filmActorIddto.setActorId( object.getActorId() );
        filmActorIddto.setFilmId( object.getFilmId() );

        return filmActorIddto;
    }

    @Override
    public FilmActorId toentity(FilmActorIddto actordto) {
        if ( actordto == null ) {
            return null;
        }

        FilmActorId filmActorId = new FilmActorId();

        filmActorId.setActorId( actordto.getActorId() );
        filmActorId.setFilmId( actordto.getFilmId() );

        return filmActorId;
    }
}
