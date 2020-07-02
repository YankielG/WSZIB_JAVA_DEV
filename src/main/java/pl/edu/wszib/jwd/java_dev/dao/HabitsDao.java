package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Habits;

@Repository
public interface HabitsDao extends PagingAndSortingRepository<Habits, Long>, CrudRepository<Habits, Long> {
    public Page<Habits> findAllById(Long id, Pageable pageable);
    public Page<Habits> findAll(Pageable pageable);
    Habits findByName(String name);
}
