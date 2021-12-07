package attestation.stat.controller;

import attestation.stat.entities.BaseEntity;
import attestation.stat.services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractController<T extends BaseEntity, S extends CommonService<T>>
        implements CommonController<T> {
    private final S service;
    @Autowired
    protected AbstractController(S service) {
        this.service = service;
    }
    @Override
    public List<T> findAll(){
        return service.findAll();
    }
}
