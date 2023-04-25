package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.ActorDTO.ActorFilmdto;
import gov.iti.jets.DTOS.ActorDTO.Actordto;
import gov.iti.jets.entity.Actor;
import gov.iti.jets.entity.Film;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-25T02:13:20+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class ActorMapperImpl implements ActorMapper {

    @Override
    public Actordto todto(Actor actor) {
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

    @Override
    public Actor toentity(Actordto actordto) {
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

    @Override
    public List<ActorFilmdto> collectionToDto(Collection<Film> filmActor) {
        if ( filmActor == null ) {
            return null;
        }

        List<ActorFilmdto> list = new ArrayList<ActorFilmdto>( filmActor.size() );
        for ( Film film : filmActor ) {
            list.add( filmToActorFilmdto( film ) );
        }

        return list;
    }

    protected ActorFilmdto filmToActorFilmdto(Film film) {
        if ( film == null ) {
            return null;
        }

        ActorFilmdto actorFilmdto = new ActorFilmdto();

        actorFilmdto.setFilmId( film.getFilmId() );
        actorFilmdto.setTitle( film.getTitle() );
        actorFilmdto.setDescription( film.getDescription() );
        actorFilmdto.setReleaseYear( film.getReleaseYear() );
        actorFilmdto.setRentalDuration( film.getRentalDuration() );
        actorFilmdto.setRentalRate( film.getRentalRate() );
        actorFilmdto.setLength( film.getLength() );
        actorFilmdto.setReplacementCost( film.getReplacementCost() );
        actorFilmdto.setRating( film.getRating() );
        actorFilmdto.setSpecialFeatures( film.getSpecialFeatures() );

        return actorFilmdto;
    }
}
