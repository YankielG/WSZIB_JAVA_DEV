package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Index;
import pl.edu.wszib.jwd.java_dev.model.Waga;

@Repository
public interface IndexDao extends CrudRepository<Index, Long> {

//    @Repository
//    public interface IndexDao extends PagingAndSortingRepository<Index, Long>, CrudRepository<Index, Long> {
//        public Page<Index> findAllById(Long id, Pageable pageable);
//        public Page<Incex> findAll(Pageable pageable);
}
