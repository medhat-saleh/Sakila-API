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
public class Languagedto {
    private Byte languageId;
    private String name;
    private Timestamp lastUpdate;
    private List<Filmdto> filmsForLanguage = new ArrayList<Filmdto>(0);
    private List<Filmdto> filmsForOriginalLanguage = new ArrayList<Filmdto>(0);

}
