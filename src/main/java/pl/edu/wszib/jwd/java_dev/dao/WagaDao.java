package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Waga;

import java.awt.print.Pageable;
@Repository
public interface WagaDao extends CrudRepository <Waga, Long> {

}
