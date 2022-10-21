package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.ParcelDal;
import at.fhtw.swen3.model.entities.TransferwarehouseDal;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class TransferwarehouseRepository implements CrudRepository<TransferwarehouseDal, Long> {
    @Override
    public <S extends TransferwarehouseDal> S save(S entity) {
        return null;
    }

    @Override
    public <S extends TransferwarehouseDal> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TransferwarehouseDal> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<TransferwarehouseDal> findAll() {
        return null;
    }

    @Override
    public Iterable<TransferwarehouseDal> findAllById(Iterable<Long> longs) {
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
    public void delete(TransferwarehouseDal entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends TransferwarehouseDal> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
