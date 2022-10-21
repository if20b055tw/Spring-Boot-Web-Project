package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.ParcelDal;
import at.fhtw.swen3.model.entities.RecipientDal;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class RecipientRepository implements CrudRepository<RecipientDal, Long> {
    @Override
    public <S extends RecipientDal> S save(S entity) {
        return null;
    }

    @Override
    public <S extends RecipientDal> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<RecipientDal> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<RecipientDal> findAll() {
        return null;
    }

    @Override
    public Iterable<RecipientDal> findAllById(Iterable<Long> longs) {
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
    public void delete(RecipientDal entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends RecipientDal> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
