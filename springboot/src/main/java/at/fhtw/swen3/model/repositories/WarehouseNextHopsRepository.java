package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.WarehouseNextHopsDal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface WarehouseNextHopsRepository extends JpaRepository<WarehouseNextHopsDal, Long> {

}
