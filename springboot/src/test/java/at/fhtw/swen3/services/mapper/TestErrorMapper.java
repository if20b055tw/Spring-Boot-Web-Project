package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.ErrorEntity;
import at.fhtw.swen3.services.dto.Error;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestErrorMapper extends GenericMapperTest<Error, ErrorEntity> {
    @Override
    public GenericMapper<Error, ErrorEntity> getMapper() {
        return ErrorMapper.INSTANCE;
    }

    @Override
    public Error getSource() {
        return new Error().errorMessage("errmsg");
    }

    @Override
    public ErrorEntity getTarget() {
        return ErrorEntity.builder().errorMessage("errmsg").build();
    }
}
