package attestation.stat.controller;

import attestation.stat.entities.City;
import attestation.stat.entities.Population;
import attestation.stat.services.CityService;
import attestation.stat.services.PopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
public class PopulationController {
    @Autowired
    PopulationService service;
    @Autowired
    CityService cityService;
    @PostMapping(value = "Population/View",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE,
                    MediaType.ALL_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Population getPopulationByCityAndYear(){
       return service.getPopulationByCityAndYear(null,null);
    }

    @PostMapping(value = "Population/Save",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE,
                    MediaType.ALL_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public void save(@RequestBody Population population){
        service.save(population);

    }
    @PostMapping(value = "Population/ViewAll",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE,
                    MediaType.ALL_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Page<Population> getPopulationList(){
        return service.getPopulation();
    }
    @PostMapping(value = "Population/Generate",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE,
                    MediaType.ALL_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public void generateValues(){
       // List<City> cities = cityService.getCityList();
       /* List<Population> populationToSave = new ArrayList<>();
        for(City city: cities){
            for(int i = 2022;i < 300000; i++ ) {
                Population population = new Population();
                population.setCity(city);
                population.setYear(i);
                Random random = new Random();
                population.setValue(random.nextDouble(0,100));
                populationToSave.add(population);
            }
        }
        service.saveAll(populationToSave);

        */
    }
    @PostMapping(value = "Population/Delete",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE,
                    MediaType.ALL_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public void deleteAll(){
        service.deleteAll();
    }
    @PostMapping(value = "Population/ViewByCity",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE,
                    MediaType.ALL_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public List<Population> getByCity(){
    //    City city = cityService.getCityList().get(0);
        return null;//service.getByCity(city);
    }
    @PostMapping(value = "Population/ViewByYear",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE,
                    MediaType.ALL_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public List<Population> getByYear(){
        return service.getByYear(20225);
    };
}
