package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.ParcelEntity;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class NewParcelInfoMapper extends AbstractMapper<NewParcelInfo, ParcelEntity> {
    public static NewParcelInfoMapper INSTANCE = Mappers.getMapper(NewParcelInfoMapper.class);
}
