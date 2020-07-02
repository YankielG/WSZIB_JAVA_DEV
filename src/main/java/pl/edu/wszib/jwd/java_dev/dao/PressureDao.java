package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Pressure;

@Repository
public interface PressureDao extends CrudRepository<Pressure, Long> {
    Pressure findByPressure(Double pulses);
}
