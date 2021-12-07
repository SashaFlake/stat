package attestation.stat.repositories;

import attestation.stat.entities.BaseEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface GenericRepository<T extends BaseEntity> extends MongoRepository<T, ObjectId> {
   // Optional<T> findById(ObjectId id);

  //  List<T> findAll();
}
