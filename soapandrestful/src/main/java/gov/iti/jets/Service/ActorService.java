package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.ActorDTO.Actordto;
import gov.iti.jets.Mapper.ActorMapper;
import gov.iti.jets.entity.Actor;

public class ActorService {

    GenericDao dao = new GenericDao<Actor>(Actor.class);

    public Actordto geActordtoById(int id) {
        Actor actor = (Actor) dao.findById(id);
        Actordto actordto = ActorMapper.INSTANCE.todto(actor);

        actordto.setActorFilmdtos(ActorMapper.INSTANCE
                .collectionToDto(actor.getFilmActors().stream().map(filmActor -> filmActor.getFilm()).toList()));

        return actordto;
    }

    public List<Actordto> getAllActor() {

        return dao.getAll(Actor.class).stream().map(actor -> ActorMapper.INSTANCE.todto((Actor) actor)).toList();

    }

    public boolean updateActor(Actordto actordto) {
        Actor actor = ActorMapper.INSTANCE.toentity(actordto);
        return dao.update(actor);
    }

    public boolean deleteActor(int actorId) {
        return dao.delete(actorId);
    }

    public Actordto AddActor(Actordto actordto) {
        System.out.println(actordto.getActorId());
        System.out.println(actordto.getFirstName());
        System.out.println(actordto.getLastName());
        System.out.println(actordto.getLastUpdate());
        System.out.println(actordto.getActorFilmdtos());

        return ActorMapper.INSTANCE.todto( (Actor)dao.insert(ActorMapper.INSTANCE.toentity(actordto)));
    }

    
}
