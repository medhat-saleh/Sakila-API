package gov.iti.jets.Controller.SoapControllers;

import java.util.List;
import gov.iti.jets.DTOS.ActorDTO.Actordto;
import gov.iti.jets.Service.ActorService;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class ActorController {
    ActorService actorService = new ActorService();

    public Actordto getActorById(Integer id) {

        Actordto actordto = actorService.geActordtoById(id);
        System.out.println(actordto);
        return actordto;

    }

    public List<Actordto> getAllActor() {
        List<Actordto> actordtos = actorService.getAllActor();

        System.out.println(actordtos);

        return actordtos;

    }

    public Actordto addActor(Actordto actordto) {

        return actorService.AddActor(actordto);

    }

    public boolean UpdateActor(Actordto actordto) {
        return actorService.updateActor(actordto);

    }

    public boolean DeleteActorById(Integer id) {
        return actorService.deleteActor(id);

    }
}
