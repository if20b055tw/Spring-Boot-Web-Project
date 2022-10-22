package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.ErrorDal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ErrorRepository extends JpaRepository<ErrorDal, Long> {

}
