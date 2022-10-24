package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.ParcelDal;
import at.fhtw.swen3.model.entities.TransferwarehouseDal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TransferwarehouseRepository extends JpaRepository<TransferwarehouseDal, Long> {

}
