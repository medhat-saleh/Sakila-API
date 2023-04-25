package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Languagedto;
import gov.iti.jets.entity.Language;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-25T02:13:20+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class LanguageMapperImpl implements LanguageMapper {

    @Override
    public Languagedto todto(Language language) {
        if ( language == null ) {
            return null;
        }

        Languagedto languagedto = new Languagedto();

        languagedto.setLanguageId( language.getLanguageId() );
        languagedto.setName( language.getName() );
        languagedto.setLastUpdate( language.getLastUpdate() );

        return languagedto;
    }

    @Override
    public Language toentity(Languagedto languagedto) {
        if ( languagedto == null ) {
            return null;
        }

        Language language = new Language();

        language.setLanguageId( languagedto.getLanguageId() );
        language.setName( languagedto.getName() );
        language.setLastUpdate( languagedto.getLastUpdate() );

        return language;
    }
}
