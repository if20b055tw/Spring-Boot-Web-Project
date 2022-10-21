package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.HopArrivalDal;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class HopArrivalRepository implements CrudRepository<HopArrivalDal, Long> {

    @Override
    public <S extends HopArrivalDal> S save(S entity) {
        return null;
    }

    @Override
    public <S extends HopArrivalDal> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<HopArrivalDal> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<HopArrivalDal> findAll() {
        return null;
    }

    @Override
    public Iterable<HopArrivalDal> findAllById(Iterable<Long> longs) {
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
    public void delete(HopArrivalDal entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends HopArrivalDal> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
