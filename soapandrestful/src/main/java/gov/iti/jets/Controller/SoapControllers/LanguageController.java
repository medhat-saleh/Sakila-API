package gov.iti.jets.Controller.SoapControllers;

import java.util.List;
import gov.iti.jets.DTOS.Languagedto;
import gov.iti.jets.Service.LanguageService;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class LanguageController {
    LanguageService languageService = new LanguageService();

    public Languagedto getLanguageById(Short id) {

        Languagedto languagedto = languageService.getLanguageById(id);
        return languagedto;
    }

    public List<Languagedto> getAllLanguages() {

        List<Languagedto> languagedtos = languageService.getAllLanguages();
        return languagedtos;

    }

    public Languagedto addLanguage(Languagedto languagedto) {

        return languageService.AddLanguage(languagedto);

    }

    public boolean UpdateLanguage(Languagedto languagedto) {

        return languageService.updateLanguage(languagedto);

    }

    public boolean DeleteLanguageById(Short id) {

        return languageService.deleteLanguage(id);

    }
}
