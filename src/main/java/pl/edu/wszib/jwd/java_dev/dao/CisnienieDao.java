package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Cisnienie;
import pl.edu.wszib.jwd.java_dev.model.Waga;


//@Repository
//    public interface CisnienieDao extends PagingAndSortingRepository<Cisnienie, Long>, CrudRepository<Cisnienie, Long> {
//        public Page<Cisnienie> findAllById(Long id, Pageable pageable);
//        public Page<Cisnienie> findAll(Pageable pageable);

@Repository
public interface CisnienieDao extends CrudRepository<Cisnienie, Long> {
}
