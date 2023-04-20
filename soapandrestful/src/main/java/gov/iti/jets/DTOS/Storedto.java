package gov.iti.jets.DTOS;

import java.sql.Timestamp;
import java.util.HashSet;
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
public class Storedto {
    
    private Byte storeId;
    private Addressdto address;
    private Staffdto staff;
    private Timestamp lastUpdate;
    private Set<Staffdto> staffs = new HashSet<Staffdto>(0);
    private Set<Inventorydto> inventories = new HashSet<Inventorydto>(0);
    private Set<Customerdto> customers = new HashSet<Customerdto>(0);

}
