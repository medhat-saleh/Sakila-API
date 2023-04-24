package gov.iti.jets.Service;

import java.util.List;
import java.util.Set;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Languagedto;
import gov.iti.jets.Mapper.FilmMapper;
import gov.iti.jets.Mapper.LanguageMapper;
import gov.iti.jets.entity.Language;

public class LanguageService {
    GenericDao dao = new GenericDao<Language>(Language.class);

    public Languagedto getLanguageById(int id) {
        Language language=(Language) dao.findById(id);
        Languagedto languagedto = LanguageMapper.INSTANCE.todto(language);
        languagedto.setFilmsForLanguage(language.getFilmsForLanguageId().stream().map(film->FilmMapper.INSTANCE.todto(film)).toList());
        languagedto.setFilmsForOriginalLanguage(language.getFilmsForOriginalLanguageId().stream().map(film->FilmMapper.INSTANCE.todto(film)).toList());

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
        Language language=LanguageMapper.INSTANCE.toentity(languagedto);
        language.setFilmsForLanguageId((Set)languagedto.getFilmsForLanguage().stream().map(film->FilmMapper.INSTANCE.toentity(film)).toList());
        language.setFilmsForOriginalLanguageId((Set)languagedto.getFilmsForOriginalLanguage().stream().map(film->FilmMapper.INSTANCE.toentity(film)).toList());

        return LanguageMapper.INSTANCE.todto((Language) dao.insert(language));
    }

   
}
