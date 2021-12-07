package attestation.stat.repositories;

import attestation.stat.entities.Country;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends MongoRepository<Country, ObjectId> {
    public List<Country> getCountriesByName(String name );
}
