package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.RecipientEntity;
import at.fhtw.swen3.services.dto.Recipient;
import org.mapstruct.Mapper;

@Mapper
public interface RecipientMapper {
    Recipient mapToRecipient(RecipientEntity recipientEntity);
    RecipientEntity mapToRecipientEntity(Recipient recipient);
}
