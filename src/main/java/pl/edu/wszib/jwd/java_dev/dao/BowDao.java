package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Bow;

@Repository
public interface BowDao extends PagingAndSortingRepository<Bow, Long>, CrudRepository<Bow, Long> {
    public Page<Bow> findAllById(Long id, Pageable pageable);
    public Page<Bow> findAll(Pageable pageable);
    Bow findByBows(String bows);
}
