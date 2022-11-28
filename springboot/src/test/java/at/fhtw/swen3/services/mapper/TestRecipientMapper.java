package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.RecipientEntity;
import at.fhtw.swen3.services.dto.Recipient;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestRecipientMapper extends GenericMapperTest<Recipient, RecipientEntity> {
    @Override
    public GenericMapper<Recipient, RecipientEntity> getMapper() {
        return RecipientMapper.INSTANCE;
    }

    @Override
    public Recipient getSource() {
        return new Recipient()
                .city("cityy")
                .name("namee")
                .country("countryy")
                .street("streett")
                .postalCode("1234");
    }

    @Override
    public RecipientEntity getTarget() {
        return RecipientEntity.builder()
                .city("cityy")
                .name("namee")
                .country("countryy")
                .street("streett")
                .postalCode("1234")
                .build();
    }
}
