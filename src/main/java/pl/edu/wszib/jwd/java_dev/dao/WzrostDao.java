package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Wzrost;

@Repository
public interface WzrostDao extends CrudRepository<Wzrost, Long> {
}
