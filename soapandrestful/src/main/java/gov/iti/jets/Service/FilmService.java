package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Filmdto;
import gov.iti.jets.Mapper.FilmMapper;
import gov.iti.jets.entity.Film;

public class FilmService {
    GenericDao dao = new GenericDao<Film>(Film.class);

    public Filmdto getFilmById(int id) {
        Filmdto filmdto = FilmMapper.INSTANCE.todto((Film) dao.findById(id));

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

    public List<Filmdto> FilmByName(String name) {
        return dao.findByName(name, Film.class).stream()
                .map(film -> FilmMapper.INSTANCE.todto((Film) film)).toList();
    }
}
