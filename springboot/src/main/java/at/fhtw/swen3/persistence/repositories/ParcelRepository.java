package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entity.ParcelEntity;
import at.fhtw.swen3.services.dto.TrackingInformation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParcelRepository extends JpaRepository<ParcelEntity, Long> {
    void reportParcelDelivery(String trackingId);
    Optional<TrackingInformation.StateEnum> trackParcel(String trackingId);
}
