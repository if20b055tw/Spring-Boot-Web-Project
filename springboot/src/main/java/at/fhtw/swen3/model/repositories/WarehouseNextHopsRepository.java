package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.WarehouseNextHopsDal;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class WarehouseNextHopsRepository implements CrudRepository<WarehouseNextHopsDal, Long> {
    @Override
    public <S extends WarehouseNextHopsDal> S save(S entity) {
        return null;
    }

    @Override
    public <S extends WarehouseNextHopsDal> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<WarehouseNextHopsDal> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<WarehouseNextHopsDal> findAll() {
        return null;
    }

    @Override
    public Iterable<WarehouseNextHopsDal> findAllById(Iterable<Long> longs) {
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
    public void delete(WarehouseNextHopsDal entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends WarehouseNextHopsDal> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
