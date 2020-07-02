package pl.edu.wszib.jwd.java_dev.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Profiles;

@Repository
public interface ProfilesDao extends CrudRepository<Profiles, Long> {
    Profiles findByUsers(String users);
}
