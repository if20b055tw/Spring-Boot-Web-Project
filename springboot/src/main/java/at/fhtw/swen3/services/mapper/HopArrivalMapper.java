package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.HopArrivalEntity;
import at.fhtw.swen3.services.dto.HopArrival;
import org.mapstruct.Mapper;

@Mapper
public interface HopArrivalMapper {
    HopArrival mapToHopArrival(HopArrivalEntity hopArrivalEntity);
    HopArrivalEntity mapToHopArrivalEntity(HopArrival hopArrival);
}
