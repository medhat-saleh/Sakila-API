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
public class Categorydto {
    private Byte categoryId;
    private String name;
    private Timestamp lastUpdate;
    private List<FilmCategorydto> filmCategoriesdto = new ArrayList<FilmCategorydto>(0);
  
}
