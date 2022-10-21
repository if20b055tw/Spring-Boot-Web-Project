package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.WarehouseDal;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class WarehouseRepository implements CrudRepository<WarehouseDal, Long> {
    @Override
    public <S extends WarehouseDal> S save(S entity) {
        return null;
    }

    @Override
    public <S extends WarehouseDal> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<WarehouseDal> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<WarehouseDal> findAll() {
        return null;
    }

    @Override
    public Iterable<WarehouseDal> findAllById(Iterable<Long> longs) {
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
    public void delete(WarehouseDal entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends WarehouseDal> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
