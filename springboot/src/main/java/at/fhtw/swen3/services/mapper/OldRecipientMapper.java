package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.RecipientEntity;
import at.fhtw.swen3.services.dto.Recipient;
import org.springframework.stereotype.Component;

@Component
public class OldRecipientMapper extends AbstractMapper<Recipient, RecipientEntity>{
    @Override
    public RecipientEntity mapToTarget(Recipient object) {
        return RecipientEntity.builder()
                .city(object.getCity())
                .country(object.getCountry())
                .name(object.getName())
                .postalCode(object.getPostalCode())
                .street(object.getStreet())
                .build();
    }

    @Override
    public Recipient mapToSource(RecipientEntity object) {
        return Recipient.builder()
                .city(object.getCity())
                .country(object.getCountry())
                .name(object.getName())
                .postalCode(object.getPostalCode())
                .street(object.getStreet())
                .build();
    }
}
