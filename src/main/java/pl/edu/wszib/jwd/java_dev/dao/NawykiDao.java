package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Nawyki;

//@Repository
//public interface NawykiDao extends CrudRepository<Nawyki, Long> {

    @Repository
    public interface NawykiDao extends PagingAndSortingRepository<Nawyki, Long>, CrudRepository<Nawyki, Long> {
        public Page<Nawyki> findAllById(Long id, Pageable pageable);
        public Page<Nawyki> findAll(Pageable pageable);
}
