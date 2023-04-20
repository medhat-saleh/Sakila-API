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
public class Languagedto {
    private Byte languageId;
    private String name;
    private Timestamp lastUpdate;
    private Set<Filmdto> filmsForLanguageId = new HashSet<Filmdto>(0);
    private Set<Filmdto> filmsForOriginalLanguageId = new HashSet<Filmdto>(0);

}
