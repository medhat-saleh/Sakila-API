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
public class Customerdto {
    private Short customerId;
    private Addressdto addressdto;
    private Storedto storedto;
    private String firstName;
    private String lastName;
    private String email;
    private boolean active;
    private Timestamp createDate;
    private Timestamp lastUpdate;
   
}
