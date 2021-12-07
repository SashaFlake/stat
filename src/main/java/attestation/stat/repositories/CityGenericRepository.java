package attestation.stat.repositories;

import attestation.stat.entities.City;
import attestation.stat.entities.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface CityGenericRepository /*extends GenericRepository<County>
*/{
   // @Override
    //Page<City> findAll(Pageable pageable);
}
