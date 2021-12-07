package attestation.stat.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

@NoArgsConstructor
@Getter
@Setter

public class Population extends BaseEntity{
    @DBRef
    City city;
    Integer year;
    Double value;

    @Override
    public String toString() {
        return "Population{" +
                "id='" + id + '\'' +
                ", city='" + city + '\'' +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
