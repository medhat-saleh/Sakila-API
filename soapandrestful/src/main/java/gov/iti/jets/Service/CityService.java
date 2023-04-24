package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Citydto;
import gov.iti.jets.Mapper.CityMapper;
import gov.iti.jets.Mapper.CountryMapper;
import gov.iti.jets.entity.City;
import gov.iti.jets.entity.Country;

public class CityService {
    GenericDao dao = new GenericDao<City>(City.class);

    public Citydto getCityById(int id) {
        City city=(City) dao.findById(id);
        System.out.println(city);
        Citydto citydto = CityMapper.INSTANCE.todto(city);
        System.out.println(citydto);

        citydto.setCountrydto(CountryMapper.INSTANCE.todto(city.getCountry()));

        return citydto;
    }

    public List<Citydto> getAllCities() {

        return dao.getAll(City.class).stream().map(city -> CityMapper.INSTANCE.todto((City) city)).toList();

    }

    public boolean updateCity(Citydto citydto) {

             City city=(City) (CityMapper.INSTANCE.toentity(citydto));
         city.setCountry(CountryMapper.INSTANCE.toentity(citydto.getCountrydto()));
        return dao.update(city);
    }

    public boolean deleteCit(int cityid) {
        return dao.delete(cityid);
    }

    public Citydto AddCity(Citydto citydto) {

         City city=(City) (CityMapper.INSTANCE.toentity(citydto));
         city.setCountry(CountryMapper.INSTANCE.toentity(citydto.getCountrydto()));
        return CityMapper.INSTANCE.todto((City)dao.insert(city));
    }

   
}
