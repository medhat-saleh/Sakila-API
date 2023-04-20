package gov.iti.jets.DTOS;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@XmlRootElement
@NoArgsConstructor
// @Setter
// @Getter
@ToString
public class Citydto {
    
    private Short cityId;
    private Countrydto country;
    private String city;
    private Timestamp lastUpdate;
    @Transient
    private Set<Addressdto> addresses = new HashSet<Addressdto>(0);

}
