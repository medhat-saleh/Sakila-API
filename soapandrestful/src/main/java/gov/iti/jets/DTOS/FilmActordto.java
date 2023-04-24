package gov.iti.jets.DTOS;

import java.sql.Timestamp;

import gov.iti.jets.DTOS.ActorDTO.Actordto;
import gov.iti.jets.entity.FilmActorId;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@XmlRootElement
@NoArgsConstructor
@ToString
public class FilmActordto {
     FilmActorId id;
     Actordto actor;
     Filmdto film;
     Timestamp lastUpdate;
}
