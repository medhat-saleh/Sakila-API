package gov.iti.jets.DTOS.ActorDTO;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@JsonPropertyOrder({"actorId", "firstName", "lastName","lastUpdate","actorFilmdtos"})

public class Actordto implements Serializable{
     Short actorId;
     String firstName;
     String lastName;
     Timestamp lastUpdate;
  
     List<ActorFilmdto> actorFilmdtos = new ArrayList<ActorFilmdto>(0);
     
    
}
