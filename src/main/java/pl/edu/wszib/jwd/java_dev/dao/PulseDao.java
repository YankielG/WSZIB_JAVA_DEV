package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Pulse;

@Repository
public interface PulseDao extends CrudRepository<Pulse, Long> {
    Pulse findByPulses(Double pulses);
}
