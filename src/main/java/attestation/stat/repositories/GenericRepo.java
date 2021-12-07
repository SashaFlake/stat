package attestation.stat.repositories;

import attestation.stat.entities.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GenericRepo<T extends BaseEntity>{
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<?> findByPredicates(List<Criteria> criteriaList, T entity){
        Query query = new Query();
        for(Criteria criteria:criteriaList){
            query.addCriteria(criteria);
        }
       return mongoTemplate.find(query,entity.getClass());
    }
}
