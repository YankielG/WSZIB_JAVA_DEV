package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Error404;

@Repository
public interface Error404Dao extends CrudRepository<Error404, Long> {
}
