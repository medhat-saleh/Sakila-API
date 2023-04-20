package gov.iti.jets.DTOS;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import gov.iti.jets.entity.FilmActor;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Actordto implements Serializable{
     Short actorId;
     String firstName;
     String lastName;
     Timestamp lastUpdate;
    @JsonIgnore
     List<FilmActordto> filmActors = new ArrayList<FilmActordto>(0);
     
    
}
