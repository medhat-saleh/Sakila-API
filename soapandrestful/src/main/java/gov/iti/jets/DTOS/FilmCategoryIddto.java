package gov.iti.jets.DTOS;

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
public class FilmCategoryIddto {
    private byte categoryId;
    private short filmId;
}
