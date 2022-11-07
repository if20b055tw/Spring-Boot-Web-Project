package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.old.HopArrivalEntity;
import at.fhtw.swen3.services.dto.HopArrival;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.OffsetDateTime;

@SpringBootTest
public class TestHopArrivalMapper extends GenericMapperTest<HopArrival, HopArrivalEntity> {
    @Override
    public GenericMapper<HopArrival, HopArrivalEntity> getMapper() {
        return HopArrivalMapper.INSTANCE;
    }

    @Override
    public HopArrival getSource() {
        return new HopArrival().code("AAAA0000").description("some description").dateTime(OffsetDateTime.parse("2022-10-01T19:20:21+01:00"));
    }

    @Override
    public HopArrivalEntity getTarget() {
        return HopArrivalEntity.builder().code("AAAA0000").description("some description").dateTime(OffsetDateTime.parse("2022-10-01T19:20:21+01:00")).build();
    }
}
