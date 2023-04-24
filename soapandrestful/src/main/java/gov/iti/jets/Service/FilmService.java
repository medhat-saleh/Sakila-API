package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Filmdto;
import gov.iti.jets.Mapper.ActorMapper;
import gov.iti.jets.Mapper.CategoryMapper;
import gov.iti.jets.Mapper.FilmActorMapper;
import gov.iti.jets.Mapper.FilmMapper;
import gov.iti.jets.Mapper.InventoryMapper;
import gov.iti.jets.entity.Film;

public class FilmService {
    GenericDao dao = new GenericDao<Film>(Film.class);

    public Filmdto getFilmById(int id) {

        Film film=(Film) dao.findById(id);
      
        Filmdto filmdto = FilmMapper.INSTANCE.todto(film);
filmdto.setFilmActor(film.getFilmActors().stream().map(actor->ActorMapper.INSTANCE.todto(actor.getActor())).toList());
filmdto.setFilmCategor(film.getFilmCategories().stream().map(category->CategoryMapper.INSTANCE.todto(category.getCategory())).toList());
filmdto.setInventoriy(film.getInventories().stream().map(inv->InventoryMapper.INSTANCE.todto(inv)).toList());

        return filmdto;
    }

    public List<Filmdto> getAllFilmds() {
        return dao.getAll(Film.class).stream().map(film -> FilmMapper.INSTANCE.todto((Film) film))
                .toList();

    }

    public boolean updateFilm(Filmdto filmdto) {
        Film film=FilmMapper.INSTANCE.toentity(filmdto);
        return dao.update( film);
    }

    public boolean deleteFilm(int filmId) {
        return dao.delete(filmId);
    }

    public Filmdto AddFilm(Filmdto filmdto) {
        return FilmMapper.INSTANCE.todto((Film) dao.insert(FilmMapper.INSTANCE.toentity(filmdto)));
    }

    
}
