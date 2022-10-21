package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.RecipientEntity;
import at.fhtw.swen3.persistence.entity.TruckEntity;
import at.fhtw.swen3.services.dto.Recipient;
import at.fhtw.swen3.services.dto.Truck;
import org.mapstruct.Mapper;

@Mapper
public interface TruckMapper {
    Truck mapToTruck(TruckEntity truckEntity);
    TruckEntity mapToTruckEntity(Truck truck);
}
