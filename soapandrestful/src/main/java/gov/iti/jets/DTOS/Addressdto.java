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
public class Addressdto {
    private Short addressId;
    private Citydto city;
    private String address;
    private String address2;
    private String district;
    private String postalCode;
    private String phone;
    private byte[] location;
    private Timestamp lastUpdate;
   
}
