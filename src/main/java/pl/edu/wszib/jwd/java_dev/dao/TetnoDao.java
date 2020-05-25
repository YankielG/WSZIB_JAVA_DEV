package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Tetno;
import pl.edu.wszib.jwd.java_dev.model.Waga;

//@Repository
//public interface TetnoDao extends PagingAndSortingRepository<Tetno, Long>, CrudRepository<Tetno, Long> {
//    public Page<Tetno> findAllById(Long id, Pageable pageable);
//    public Page<Tetno> findAll(Pageable pageable);

@Repository
public interface TetnoDao extends CrudRepository<Tetno, Long> {
}
