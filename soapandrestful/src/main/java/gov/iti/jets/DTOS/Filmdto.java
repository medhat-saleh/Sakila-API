package gov.iti.jets.DTOS;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import gov.iti.jets.DTOS.ActorDTO.Actordto;
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
public class Filmdto {
    private Short filmId;
    private Languagedto languageByLanguageId;
    private Languagedto languageByOriginalLanguageId;
    private String title;
    private String description;
    private Date releaseYear;
    private byte rentalDuration;
    private BigDecimal rentalRate;
    private Short length;
    private BigDecimal replacementCost;
    private String rating;
    private String specialFeatures;
    private Timestamp lastUpdate;
    private List<Inventorydto> inventoriy = new ArrayList<Inventorydto>();
    private List<Actordto> filmActor = new ArrayList<Actordto>();
    private List<Categorydto> filmCategor = new ArrayList<Categorydto>();

}
