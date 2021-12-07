package attestation.stat.repositories;

import attestation.stat.entities.City;
import attestation.stat.entities.Population;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PopulationRepository extends MongoRepository<Population, ObjectId> {
    Population getPopulationByCityAndYear(City city, Integer year);
    List<Population> findAll();
    Page<Population> findAll(Pageable pageable);
    List<Population> getPopulationByYear(Integer year);
    List<Population> getPopulationByCity(City city);
    List<Population> getPopulationByYearAfter(Integer year);
}
