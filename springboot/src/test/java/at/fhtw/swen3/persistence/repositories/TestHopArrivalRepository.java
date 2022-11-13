package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entity.HopArrivalEntity;
import at.fhtw.swen3.persistence.entity.ParcelEntity;
import at.fhtw.swen3.persistence.entity.RecipientEntity;
import at.fhtw.swen3.services.dto.TrackingInformation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.OffsetDateTime;
import java.util.ArrayList;

@SpringBootTest
public class TestHopArrivalRepository {
    @Autowired
    private HopArrivalRepository repository;

    private HopArrivalEntity getHopArrivalEntity() {
        return HopArrivalEntity.builder()
                .code("AAAA0000")
                .parcel(
                        ParcelEntity.builder()
                                .weight(1.0F)
                                .state(TrackingInformation.StateEnum.DELIVERED)
                                .trackingId("AAAAFFFFG")
                                .visitedHops(new ArrayList<>())
                                .futureHops(new ArrayList<>())
                                .sender(
                                        RecipientEntity.builder()
                                                .city("City")
                                                .country("Country")
                                                .street("Street")
                                                .name("Name")
                                                .postalCode("1345")
                                                .build()
                                )
                                .recipient(
                                        RecipientEntity.builder()
                                                .city("City")
                                                .country("Country")
                                                .street("Street")
                                                .name("Name")
                                                .postalCode("1345")
                                                .build()
                                )
                                .build()
                )
                .description("some description")
                .dateTime(OffsetDateTime.parse("2022-10-01T19:20:21+01:00")).build();
    }

    /*@Test
    public void testHopArrivalRepository() {
        Assertions.assertEquals(0, repository.count());

        repository.save(getHopArrivalEntity());
        Assertions.assertEquals(1, repository.count());

        HopArrivalEntity entity = repository.findByCode("AAAA0000");
        Assertions.assertEquals(getHopArrivalEntity(), entity);

        repository.delete(getHopArrivalEntity());
        Assertions.assertEquals(0, repository.count());
    }*/
}
