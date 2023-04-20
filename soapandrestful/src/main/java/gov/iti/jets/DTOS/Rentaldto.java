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
public class Rentaldto {
    private Integer rentalId;
     private Staffdto staff;
     private Inventorydto inventory;
     private Customerdto customer;
     private Timestamp rentalDate;
     private Timestamp returnDate;
     private Timestamp lastUpdate;
     private Set<Paymentdto> payments = new HashSet<Paymentdto>(0);

}
