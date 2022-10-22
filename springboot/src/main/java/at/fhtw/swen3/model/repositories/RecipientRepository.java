package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.ParcelDal;
import at.fhtw.swen3.model.entities.RecipientDal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipientRepository extends JpaRepository<RecipientDal, Long> {

}
