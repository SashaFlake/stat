package attestation.stat.services;

import attestation.stat.entities.City;
import attestation.stat.entities.Country;
import attestation.stat.repositories.CountryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryRepository repository;
    public void save(Country country_){

        /*Country country = new Country();
        country.setName(country_.getName());
        country.setCities(country_.getCities());
        for(City city:country_.getCities()) {
            City city_ = new City(city.getName());
            country.getCities().add(city_);
        }

         */

        repository.save(country_);
    }

    public List<Country> getCountries(String name){
        return repository.getCountriesByName(name);
    }
}
