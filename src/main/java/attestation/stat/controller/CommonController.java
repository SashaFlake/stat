package attestation.stat.controller;


import attestation.stat.entities.BaseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


public interface CommonController<T extends BaseEntity> {
    @PostMapping("/View")
    List<T> findAll();
}
