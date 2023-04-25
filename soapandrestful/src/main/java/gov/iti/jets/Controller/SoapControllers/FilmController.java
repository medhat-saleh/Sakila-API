package gov.iti.jets.Controller.SoapControllers;

import java.util.List;
import gov.iti.jets.DTOS.Filmdto;
import gov.iti.jets.Service.FilmService;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class FilmController {
    FilmService filmService = new FilmService();

   
    public Filmdto getFilmById( Short id) {
        
            Filmdto filmdto = filmService.getFilmById(id);
            return filmdto;
        
    }

    public List<Filmdto> getAllFilms() {
    
            List<Filmdto> customerdtos = filmService.getAllFilmds();
            return customerdtos; }

    public Filmdto addFilm(Filmdto filmdto) {
        
        return filmService.AddFilm(filmdto);      

    }

     public boolean UpdateFilm(Filmdto filmdto) {
        
            return filmService.updateFilm(filmdto);
        
    }

    public boolean DeleteFilmById(Short id) {
        
            return  filmService.deleteFilm(id);
         }
}
