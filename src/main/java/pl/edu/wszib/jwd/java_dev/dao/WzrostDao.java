package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import pl.edu.wszib.jwd.java_dev.model.Wzrost;

public interface WzrostDao extends CrudRepository<Wzrost, Long> {
}
