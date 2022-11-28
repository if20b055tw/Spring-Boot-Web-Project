package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entities.ParcelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelRepository extends JpaRepository<ParcelEntity, Long> {
    //void reportParcelDelivery(String trackingId);
    //Optional<TrackingInformation.StateEnum> trackParcel(String trackingId);
}
