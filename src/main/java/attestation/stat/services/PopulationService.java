package attestation.stat.services;

import attestation.stat.config.MongoConfig;
import attestation.stat.entities.BaseEntity;
import attestation.stat.entities.City;
import attestation.stat.entities.Population;
import attestation.stat.repositories.PopulationRepository;
import com.mongodb.MongoWriteException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PopulationService<T extends BaseEntity> {
    @Autowired
    PopulationRepository repository;
    @Autowired
    CityService cityService;
    @Autowired
    MongoConfig mongoConfig;
    public Population getPopulationByCityAndYear(City city, Integer year) {
        List<City> cityList = cityService.getCityList();

        return repository.getPopulationByCityAndYear(cityList.get(0),2020);
    }
    public void save(Population population){
       // population.setCity(cityService.findCityById(population.getCity().getId()));
        try {
            repository.save(population);
        }catch (MongoWriteException e){
            log.error(e.getMessage());
        }
    }
    public List<Population> getPopulation_(){
        return repository.findAll();
    }

    public Page<Population> getPopulation(){
        Pageable firstPageWithTwoElements = PageRequest.of(0, 20);
        return repository.findAll(firstPageWithTwoElements);
    }

    public void delete(Population population){
        repository.delete(population);
    }
    public void deleteAll(){
        repository.deleteAll();
    }
    public void saveAll(List<Population> populations)
    {
        repository.saveAll(populations);
    }
    public List<Population> getByCity(City city){
        //Query query = datastore.find(T.class);


        //return repository.getPopulationByCity(city);
        return null;
    }
    public List<Population> getByYear(Integer year){
        return repository.getPopulationByYear(year);
    }

}
