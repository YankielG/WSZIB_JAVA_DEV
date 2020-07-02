package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Weight;

@Repository
public interface WeightDao extends CrudRepository<Weight, Long> {
    Weight findByWeights(Double weights);
}
