package attestation.stat.entities;

import attestation.stat.config.MongoDbSupport;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Reference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document
@Getter
@Setter
@Entity
public class City extends MongoDbSupport<City> {

    String name;
    @Reference
    Country country;
    public City() {
    }

    public City(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public City(String name) {
        this.name = name;
    }
}
