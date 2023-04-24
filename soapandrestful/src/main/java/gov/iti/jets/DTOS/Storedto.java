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
    private Addressdto addressdto;
    private Staffdto staffdto;
    private Timestamp lastUpdate;
    
}
