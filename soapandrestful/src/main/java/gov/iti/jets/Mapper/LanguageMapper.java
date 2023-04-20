package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.Languagedto;
import gov.iti.jets.entity.Language;
@Mapper
public interface LanguageMapper {
    LanguageMapper INSTANCE=Mappers.getMapper(LanguageMapper.class);
    Languagedto todto(Language language);
    Language toentity(Languagedto languagedto);

}
