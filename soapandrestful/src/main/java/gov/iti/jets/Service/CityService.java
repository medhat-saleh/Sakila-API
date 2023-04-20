package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Citydto;
import gov.iti.jets.Mapper.CityMapper;
import gov.iti.jets.entity.City;

public class CityService {
    GenericDao dao = new GenericDao<City>(City.class);

    public Citydto getCityById(int id) {
        Citydto citydto = CityMapper.INSTANCE.todto((City) dao.findById(id));

        return citydto;
    }

    public List<Citydto> getAllCities() {
        return dao.getAll(City.class).stream().map(city -> CityMapper.INSTANCE.todto((City) city))
                .toList();

    }

    public boolean updateCity(Citydto citydto) {
         City city=CityMapper.INSTANCE.toentity(citydto);
        return dao.update(city);
    }

    public boolean deleteCit(int cityid) {
        return dao.delete(cityid);
    }

    public Citydto AddCity(Citydto citydto) {
        return CityMapper.INSTANCE.todto((City) dao.insert(CityMapper.INSTANCE.toentity(citydto)));
    }

    public List<Citydto> CityByName(String name) {
        return dao.findByName(name, City.class).stream()
                .map(city -> CityMapper.INSTANCE.todto((City) city)).toList();
    }
}
