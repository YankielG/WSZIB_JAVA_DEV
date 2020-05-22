package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Temperatura;

@Repository
public interface TemperaturaDao extends CrudRepository <Temperatura,Long> {
//    na potrzeby testu

    //Mikłas
    //Temperatura findByTemperatura(Double temeratura);
    Temperatura findByTemp(Double temeratura);


//Temperatura findBy user_id (Long id){
//    return userid;
//    }

}
