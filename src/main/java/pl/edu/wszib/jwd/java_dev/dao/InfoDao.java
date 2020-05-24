package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Info;
import pl.edu.wszib.jwd.java_dev.model.Waga;

@Repository
public interface InfoDao extends CrudRepository<Info, Long> {

//    public interface infoDao extends PagingAndSortingRepository<Info, Long>, CrudRepository<Info, Long> {
//        public Page<Info> findAllById(Long id, Pageable pageable);
//        public Page<Info> findAll(Pageable pageable);
}
