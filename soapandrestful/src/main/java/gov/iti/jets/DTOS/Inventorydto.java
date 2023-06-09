package gov.iti.jets.DTOS;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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
public class Inventorydto {
    private Integer inventoryId;
    private Storedto store;
    private Filmdto film;
    private Timestamp lastUpdate;
    private List<Rentaldto> rental = new ArrayList<Rentaldto>();

}
