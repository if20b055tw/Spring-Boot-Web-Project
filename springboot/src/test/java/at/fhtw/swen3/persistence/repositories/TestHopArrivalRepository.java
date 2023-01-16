package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entities.HopArrivalEntity;
import at.fhtw.swen3.persistence.entities.ParcelEntity;
import at.fhtw.swen3.persistence.entities.RecipientEntity;
import at.fhtw.swen3.services.dto.Recipient;
import at.fhtw.swen3.services.dto.TrackingInformation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Optional;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
@TestPropertySource("/application.properties")
public class TestHopArrivalRepository {
    @Autowired
    private HopArrivalRepository hopArrivalRepository;
    @Autowired
    private ParcelRepository parcelRepository;
    @Autowired
    private RecipientRepository recipientRepository;

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
                                                .street("Street 1")
                                                .name("Name")
                                                .postalCode("A-1345")
                                                .build()
                                )
                                .recipient(
                                        RecipientEntity.builder()
                                                .city("City")
                                                .country("Country")
                                                .street("Street 1")
                                                .name("Name")
                                                .postalCode("A-1345")
                                                .build()
                                )
                                .build()
                )
                .description("some description")
                .dateTime(OffsetDateTime.parse("2022-10-01T19:20:21+01:00")).build();
    }

    @Test
    public void testHopArrivalRepository() {
        Assertions.assertEquals(0, hopArrivalRepository.count());

        HopArrivalEntity hopArrivalEntity = getHopArrivalEntity();
        //ParcelEntity parcelEntity = hopArrivalEntity.getParcel();
        //RecipientEntity recipient = parcelEntity.getRecipient();
        //RecipientEntity sender = parcelEntity.getSender();

        //recipientRepository.save(recipient);
        //recipientRepository.save(sender);
        //parcelRepository.save(parcelEntity);
        hopArrivalRepository.save(hopArrivalEntity);
        Assertions.assertEquals(1, hopArrivalRepository.count());

        Optional<HopArrivalEntity> entity = hopArrivalRepository.findByCode("AAAA0000");
        Assertions.assertTrue(entity.isPresent());
        Assertions.assertEquals(hopArrivalEntity, entity.get());

        hopArrivalRepository.delete(hopArrivalEntity);
        Assertions.assertEquals(0, hopArrivalRepository.count());
    }
}
