package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Profil;
import pl.edu.wszib.jwd.java_dev.model.Waga;

@Repository
public interface ProfilDao extends CrudRepository<Profil, Long> {

//    public interface ProfilDao extends PagingAndSortingRepository<Profil, Long>, CrudRepository<Profil, Long> {
//        public Page<Profil> findAllById(Long id, Pageable pageable);
//        public Page<Profil> findAll(Pageable pageable);
}
