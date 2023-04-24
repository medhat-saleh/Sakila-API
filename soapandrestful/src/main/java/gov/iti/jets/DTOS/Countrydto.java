package gov.iti.jets.DTOS;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
public class Countrydto {
    private Short countryId;
    private String country;
    private Timestamp lastUpdate;
    private List<Citydto> countrycities = new ArrayList<Citydto>();

}
