package gov.iti.jets.DTOS;

import java.math.BigDecimal;
import java.sql.Timestamp;

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
public class Paymentdto {
    private Short paymentId;
     private Staffdto staffdto;
     private Rentaldto rentaldto;
     private Customerdto customerdto;
     private BigDecimal amount;
     private Timestamp paymentDate;
     private Timestamp lastUpdate;
}
