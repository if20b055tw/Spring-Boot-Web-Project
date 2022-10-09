package at.fhtw.swen3;

import at.fhtw.swen3.services.ParcelService;
import at.fhtw.swen3.services.dto.Recipient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTest {
    @Autowired
    ParcelService parcelService;

    @Test
    void recipientTest() {

        Recipient recipient = Recipient.builder()
                .street("Thomasstraße 12")
                .name("Thomas")
                .postalCode("2314")
                .city("Thseran")
                .country("ptbs")
                .build();

        //parcelService.savePostalCode(recipient);

    }


}
