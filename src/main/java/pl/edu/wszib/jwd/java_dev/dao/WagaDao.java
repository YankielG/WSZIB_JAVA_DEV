package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Waga;

@Repository
public interface WagaDao extends PagingAndSortingRepository<Waga, Long>, CrudRepository<Waga, Long> {
    public Page<Waga> findAllById(Long id, Pageable pageable);
    public Page<Waga> findAll(Pageable pageable);

//public interface WagaDao extends CrudRepository <Waga, Long> {
}
