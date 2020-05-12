package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import pl.edu.wszib.jwd.java_dev.model.Info;

public interface InfoDao extends CrudRepository<Info, Long> {
}
