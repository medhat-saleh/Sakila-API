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
public class Staffdto {
    private Byte staffId;
    private Addressdto address;
    private Storedto store;
    private String firstName;
    private String lastName;
    private byte[] picture;
    private String email;
    private boolean active;
    private String username;
    private String password;
    private Timestamp lastUpdate;
    private Set<Paymentdto> payments = new HashSet<Paymentdto>(0);
    private Set<Storedto> stores = new HashSet<Storedto>(0);
    private Set<Rentaldto> rentals = new HashSet<Rentaldto>(0);

}
