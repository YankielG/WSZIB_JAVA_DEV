package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Error404;
import pl.edu.wszib.jwd.java_dev.model.Waga;

@Repository
public interface Error404Dao extends CrudRepository<Error404, Long> {

//    public interface Error404Dao extends PagingAndSortingRepository<Error404, Long>, CrudRepository<Error404, Long> {
//        public Page<Error404> findAllById(Long id, Pageable pageable);
//        public Page<Error404> findAll(Pageable pageable);

}
