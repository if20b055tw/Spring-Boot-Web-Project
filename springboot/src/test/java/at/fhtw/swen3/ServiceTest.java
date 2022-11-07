package at.fhtw.swen3;

import at.fhtw.swen3.persistence.entity.old.ErrorEntity;
import at.fhtw.swen3.persistence.entity.old.HopEntity;
import at.fhtw.swen3.persistence.entity.old.ParcelEntity;
import at.fhtw.swen3.persistence.entity.old.RecipientEntity;
import at.fhtw.swen3.services.dto.*;
import at.fhtw.swen3.services.dto.Error;
import at.fhtw.swen3.services.mapper.ErrorMapper;
import at.fhtw.swen3.services.mapper.HopMapper;
import at.fhtw.swen3.services.mapper.ParcelMapper;
import at.fhtw.swen3.services.mapper.RecipientMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTest {
/*
    @Autowired
    ParcelServiceImpl parcelService;

    @Test
    void recipientTest() {

        Recipient recipient = Recipient.builder()
                .street("Thomasstraße 12")
                .name("Thomas")
                .postalCode("2314")
                .city("Thseran")
                .country("Österreich")
                .build();

        parcelService.savePostalCode(recipient);

    }
*/

    private ErrorMapper errorMapper = Mappers.getMapper(ErrorMapper.class);
    private ParcelMapper parcelMapper = Mappers.getMapper(ParcelMapper.class);
    private RecipientMapper recipientMapper = Mappers.getMapper(RecipientMapper.class);

    private HopMapper hopMapper = Mappers.getMapper(HopMapper.class);

    @Test
    void recipientTest() {

        ErrorEntity entity = new ErrorEntity();
        entity.setErrorMessage("errmsg");

        Error err = errorMapper.mapToSource(entity);
        System.out.println(err.getErrorMessage());

    }

    @Test
    void recipientTest2() {

        RecipientEntity entity = new RecipientEntity();
        entity.setCity("Hochhausen");
        entity.setCountry("Gasse");
        entity.setStreet("Libanon 3");
        entity.setName("Recip");

        Recipient pdto = recipientMapper.mapToSource(entity);
        System.out.println(pdto.getStreet());
        System.out.println(pdto.getCity());
        System.out.println(pdto.getCountry());




    }

    @Test
    void recipientTest3() {

        ParcelEntity entity = new ParcelEntity();
        entity.setState(TrackingInformation.StateEnum.DELIVERED);
        entity.setWeight(1.0f);
        entity.setRecipient(RecipientEntity.builder().name("Recip").street("Libanon 3").country("Gasse").city("Hochhausen").build());

        Parcel pdto = parcelMapper.mapToParcel(entity);
        NewParcelInfo npi = parcelMapper.mapToNewParcelInfo(entity);
        TrackingInformation ti = parcelMapper.mapToTrackingInformation(entity);
        System.out.println(pdto.getWeight());
        System.out.println(pdto.getRecipient().getStreet());
        System.out.println(ti.getState().getValue());

        /*Parcel p = new Parcel();
        p.setRecipient(Recipient.builder().name("Recip").street("Libanon 3").country("Gasse").city("Hochhausen").build());
        p.setWeight(1.0f);

        NewParcelInfo npi = new NewParcelInfo();
        npi.setTrackingId("s");

        TrackingInformation ti = new TrackingInformation();
        ti.setState(TrackingInformation.StateEnum.DELIVERED);*/



    }

    @Test
    void hopTest() {

        HopEntity entity = new HopEntity();
        entity.setDescription("Some desc");
        entity.setCode("CODE");

        Hop dto = HopMapper.INSTANCE.mapToSource(entity);
        System.out.println("HOP TEST");
        System.out.println(dto.getDescription());
        System.out.println(dto.getCode());



    }
}
