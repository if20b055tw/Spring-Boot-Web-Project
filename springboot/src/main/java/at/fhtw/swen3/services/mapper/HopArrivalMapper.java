package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.HopArrivalEntity;
import at.fhtw.swen3.services.dto.HopArrival;
import org.springframework.stereotype.Component;

@Component
public class HopArrivalMapper extends AbstractMapper<HopArrival, HopArrivalEntity> {

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
        return HopArrival.builder()
                .code(object.getCode())
                .dateTime(object.getDateTime())
                .description(object.getDescription())
                .build();
    }
}
