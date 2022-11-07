package at.fhtw.swen3.services.mapper.old;

import at.fhtw.swen3.persistence.entity.old.HopArrivalEntity;
import at.fhtw.swen3.services.dto.HopArrival;
import at.fhtw.swen3.services.mapper.AbstractMapper;
import org.springframework.stereotype.Component;

@Component
public class OldHopArrivalMapper extends AbstractMapper<HopArrival, HopArrivalEntity> {

    @Override
    public HopArrivalEntity mapToTarget(HopArrival object) {
        return HopArrivalEntity.builder()
                .code(object.getCode())
                .dateTime(object.getDateTime())
                .description(object.getDescription())
                .build();
    }

    @Override
    public HopArrival mapToSource(HopArrivalEntity object) {
        return new HopArrival()
                .code(object.getCode())
                .dateTime(object.getDateTime())
                .description(object.getDescription());
    }
}
