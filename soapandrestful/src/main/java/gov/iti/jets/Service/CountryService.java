package gov.iti.jets.Service;

import java.util.List;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Countrydto;
import gov.iti.jets.Mapper.CountryMapper;
import gov.iti.jets.entity.Country;

public class CountryService {
    GenericDao dao = new GenericDao<Country>(Country.class);

    public Countrydto getCountryById(int id) {
        Countrydto countrydto = CountryMapper.INSTANCE.todto((Country) dao.findById(id));

        return countrydto;
    }

    public List<Countrydto> getAllCountries() {
        return dao.getAll(Country.class).stream().map(country -> CountryMapper.INSTANCE.todto((Country) country))
                .toList();

    }

    public boolean updateCountrey(Countrydto countrydto) {
        Country country=CountryMapper.INSTANCE.toentity(countrydto);
        return dao.update( country);
    }

    public boolean deleteCountry(int countryid) {
        return dao.delete(countryid);
    }

    public Countrydto Addcountry(Countrydto countrydto) {
        return CountryMapper.INSTANCE.todto((Country) dao.insert(CountryMapper.INSTANCE.toentity(countrydto)));
    }

    public List<Countrydto> CountryByName(String name) {
        return dao.findByName(name, Country.class).stream()
                .map(country -> CountryMapper.INSTANCE.todto((Country) country)).toList();
    }
}
