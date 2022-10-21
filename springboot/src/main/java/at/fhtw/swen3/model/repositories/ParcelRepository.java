package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.ParcelDal;
import at.fhtw.swen3.persistence.entity.ParcelEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class ParcelRepository implements CrudRepository<ParcelDal, Long> {
    @Override
    public <S extends ParcelDal> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ParcelDal> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ParcelDal> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<ParcelDal> findAll() {
        return null;
    }

    @Override
    public Iterable<ParcelDal> findAllById(Iterable<Long> longs) {
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
    public void delete(ParcelDal entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ParcelDal> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
