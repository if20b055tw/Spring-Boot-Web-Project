package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.HopDal;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class HopRepository implements CrudRepository<HopDal, Long> {

    @Override
    public <S extends HopDal> S save(S entity) {
        return null;
    }

    @Override
    public <S extends HopDal> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<HopDal> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<HopDal> findAll() {
        return null;
    }

    @Override
    public Iterable<HopDal> findAllById(Iterable<Long> longs) {
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
    public void delete(HopDal entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends HopDal> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
