package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.BowType;

@Repository
public interface BowTypeDao extends CrudRepository<BowType, Long> {
    BowType findByBowtypes(String bowtypes);
}
