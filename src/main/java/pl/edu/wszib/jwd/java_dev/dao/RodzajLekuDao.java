package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.RodzajLeku;

@Repository
public interface RodzajLekuDao extends CrudRepository<RodzajLeku, Long> {

//    @Repository
//    public interface RodzajLekuDao extends PagingAndSortingRepository<RodzajLeku, Long>, CrudRepository<RodzajLeku, Long> {
//        public Page<RodzajLeku> findAllById(Long id, Pageable pageable);
//        public Page<RodzajLeku> findAll(Pageable pageable);
}
