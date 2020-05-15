package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Nawyki;

@Repository
public interface NawykiDao extends CrudRepository<Nawyki, Long> {
}
