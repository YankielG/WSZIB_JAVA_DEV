package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Start;
import pl.edu.wszib.jwd.java_dev.model.Waga;

@Repository
public interface StartDao extends CrudRepository<Start, Long> {

//    public interface StartDao extends PagingAndSortingRepository<Start, Long>, CrudRepository<Start, Long> {
//        public Page<Start> findAllById(Long id, Pageable pageable);
//        public Page<Start> findAll(Pageable pageable);
}
