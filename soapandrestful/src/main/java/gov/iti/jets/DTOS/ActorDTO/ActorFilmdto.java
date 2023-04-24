package gov.iti.jets.DTOS.ActorDTO;

import java.math.BigDecimal;
import java.sql.Date;

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
public class ActorFilmdto {
    private Short filmId;
   
    private String title;
    private String description;
    private Date releaseYear;
    private byte rentalDuration;
    private BigDecimal rentalRate;
    private Short length;
    private BigDecimal replacementCost;
    private String rating;
    private String specialFeatures;
   
}
