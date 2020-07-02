package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Temperature;

@Repository
public interface TemperatureDao extends CrudRepository<Temperature, Long> {
    Temperature findByTemperatures(Double temeratures);
}
