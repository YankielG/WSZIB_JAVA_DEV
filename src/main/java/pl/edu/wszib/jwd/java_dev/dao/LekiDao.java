package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Leki;

@Repository
public interface LekiDao extends CrudRepository<Leki, Long> {
}
