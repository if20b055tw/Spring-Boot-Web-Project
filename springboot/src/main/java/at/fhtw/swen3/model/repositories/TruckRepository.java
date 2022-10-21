package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.TruckDal;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class TruckRepository implements CrudRepository<TruckDal, Long> {
    @Override
    public <S extends TruckDal> S save(S entity) {
        return null;
    }

    @Override
    public <S extends TruckDal> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TruckDal> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<TruckDal> findAll() {
        return null;
    }

    @Override
    public Iterable<TruckDal> findAllById(Iterable<Long> longs) {
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
    public void delete(TruckDal entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends TruckDal> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
