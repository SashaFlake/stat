package attestation.stat.controller;

import attestation.stat.entities.BaseEntity;
import attestation.stat.entities.City;
import attestation.stat.services.CityService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value = "/api/City", produces = "application/json")
public class CityControllerGeneric extends AbstractController<City, CityService> {
    public CityControllerGeneric(CityService service) {
        super(service);
    }
}
