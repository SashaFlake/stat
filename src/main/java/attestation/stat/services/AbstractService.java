package attestation.stat.services;

import attestation.stat.entities.BaseEntity;
import attestation.stat.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractService<T extends BaseEntity, R extends GenericRepository<T>> implements  CommonService<T>{
    protected final R repository;
    @Autowired
    public AbstractService(R repository){
        this.repository = repository;
    }
}
