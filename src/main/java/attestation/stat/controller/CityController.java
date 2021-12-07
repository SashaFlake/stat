package attestation.stat.controller;

import attestation.stat.entities.City;
import attestation.stat.services.CityService;
import attestation.stat.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
public class CityController {
  /*  @Autowired
    CityService cityService;
    @Autowired
    CountryService countryService;
    @PostMapping(value = "City/View",
            //    consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public List<City> getAllCities(){
       return cityService.getCityList();
    }
    @PostMapping(value = "City/Save",
                consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE,
                MediaType.ALL_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public void saveCity(@RequestBody City city){
       cityService.save(city);
    }

   */
}
