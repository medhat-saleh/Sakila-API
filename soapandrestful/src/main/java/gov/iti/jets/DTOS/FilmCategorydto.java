package gov.iti.jets.DTOS;

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
public class FilmCategorydto {
    private FilmCategoryIddto id;
    private Categorydto category;
    private Filmdto film;
    private Timestamp lastUpdate;
}
