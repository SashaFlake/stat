package attestation.stat.services;

import attestation.stat.config.MongoDbSupport;
import attestation.stat.entities.BaseEntity;
import attestation.stat.repositories.GenericRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class GenericService<T extends MongoDbSupport<T>> {
    @Autowired
    GenericRepo genericRepo;
    public List<Criteria> getCriteria(List<String> fields, List<String> values){
        List<Criteria> criteriaList = new ArrayList<>();
        for(String field:fields){
            criteriaList.add(Criteria.where(field).is("Mellbourn"));
        }
        return criteriaList;
    }


    public List<T> getEntityByPredicates(){
        List<String> f = new ArrayList<>();
        f.add("city");
        return null;
      //  MongoDbSupport.
      //  genericRepo.findByPredicates(getCriteria(f,T.getEntry()),null)
    }

}
