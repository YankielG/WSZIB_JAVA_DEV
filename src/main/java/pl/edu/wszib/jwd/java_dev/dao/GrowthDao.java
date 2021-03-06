package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Growth;

@Repository
public interface GrowthDao extends CrudRepository<Growth, Long> {
    Growth findByGrowths(Double growths);
}
