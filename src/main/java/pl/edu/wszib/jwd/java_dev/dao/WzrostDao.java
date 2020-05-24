package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Waga;
import pl.edu.wszib.jwd.java_dev.model.Wzrost;

@Repository
public interface WzrostDao extends PagingAndSortingRepository<Wzrost, Long>, CrudRepository<Wzrost, Long> {
    public Page<Wzrost> findAllById(Long id, Pageable pageable);
    public Page<Wzrost> findAll(Pageable pageable);

//public interface WzrostDao extends CrudRepository<Wzrost, Long> {
}
