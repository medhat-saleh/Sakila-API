package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Languagedto;
import gov.iti.jets.Mapper.LanguageMapper;
import gov.iti.jets.entity.Language;

public class LanguageService {
    GenericDao dao = new GenericDao<Language>(Language.class);

    public Languagedto getLanguageById(int id) {
        Languagedto languagedto = LanguageMapper.INSTANCE.todto((Language) dao.findById(id));

        return languagedto;
    }

    public List<Languagedto> getAllLanguages() {
        return dao.getAll(Language.class).stream().map(language -> LanguageMapper.INSTANCE.todto((Language) language))
                .toList();

    }

    public boolean updateLanguage(Languagedto languagedto) {
        Language language=LanguageMapper.INSTANCE.toentity(languagedto);
        return dao.update( language);
    }

    public boolean deleteLanguage(int LanguageId) {
        return dao.delete(LanguageId);
    }

    public Languagedto AddLanguage(Languagedto languagedto) {
        return LanguageMapper.INSTANCE.todto((Language) dao.insert(LanguageMapper.INSTANCE.toentity(languagedto)));
    }

    public List<Languagedto> LanguageByName(String name) {
        return dao.findByName(name, Language.class).stream()
                .map(language -> LanguageMapper.INSTANCE.todto((Language) language)).toList();
    }
}
