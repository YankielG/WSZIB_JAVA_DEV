package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.Model.Temperatura;

@Repository
public interface TemperaturaDao extends CrudRepository <Temperatura,Integer> {
Temperatura findByTemperatura(float temeratura);
}
