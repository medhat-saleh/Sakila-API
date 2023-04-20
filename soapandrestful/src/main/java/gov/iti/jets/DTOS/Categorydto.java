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
public class Categorydto {
    private Byte categoryId;
    private String name;
    private Timestamp lastUpdate;
    private Set<FilmCategorydto> filmCategories = new HashSet<FilmCategorydto>(0);
  
}
