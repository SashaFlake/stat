package attestation.stat.repositories;

import attestation.stat.entities.City;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CityRepository extends MongoRepository<City, ObjectId> {
   // City findCityByName(String name);
    //List<City> findAll();
//    City findCityById(ObjectId id);
}
