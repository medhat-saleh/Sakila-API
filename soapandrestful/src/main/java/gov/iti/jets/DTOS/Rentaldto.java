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
public class Rentaldto {
    private Integer rentalId;
     private Staffdto staffdto;
     private Inventorydto inventorydto;
     private Customerdto customerdto;
     private Timestamp rentalDate;
     private Timestamp returnDate;
     private Timestamp lastUpdate;
     private List<Paymentdto> paymentdtos = new ArrayList<Paymentdto>(0);

}
