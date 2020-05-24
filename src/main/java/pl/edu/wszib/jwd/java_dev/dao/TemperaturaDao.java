package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Temperatura;
import pl.edu.wszib.jwd.java_dev.model.Waga;

@Repository
public interface TemperaturaDao extends PagingAndSortingRepository<Temperatura, Long>, CrudRepository<Temperatura, Long> {
    public Page<Temperatura> findAllById(Long id, Pageable pageable);
    public Page<Temperatura> findAll(Pageable pageable);

//public interface TemperaturaDao extends CrudRepository<Temperatura, Long> {

    Temperatura findByTemp(Double temeratura);

}
