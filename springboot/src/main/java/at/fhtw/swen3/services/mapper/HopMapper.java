package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.HopEntity;
import at.fhtw.swen3.services.dto.Hop;
import org.mapstruct.Mapper;

@Mapper
public interface HopMapper {
    Hop mapToHop(HopEntity hopEntity);
    HopEntity mapToHopEntity(Hop hop);
}
