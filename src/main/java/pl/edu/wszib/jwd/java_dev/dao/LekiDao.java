package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Leki;


@Repository
public interface LekiDao extends CrudRepository<Leki, Long> {

//@Repository
//interface LekiDao extends PagingAndSortingRepository<Leki, Long>, CrudRepository<Leki, Long> {
//    public Page<Leki> findAllById(Long id, Pageable pageable);
//    public Page<Leki> findAll(Pageable pageable);
}
