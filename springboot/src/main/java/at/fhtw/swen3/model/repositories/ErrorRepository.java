package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.ErrorDal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ErrorRepository implements CrudRepository<ErrorDal, Long> {

    @Override
    public <S extends ErrorDal> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ErrorDal> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ErrorDal> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<ErrorDal> findAll() {
        return null;
    }

    @Override
    public Iterable<ErrorDal> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(ErrorDal entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ErrorDal> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
