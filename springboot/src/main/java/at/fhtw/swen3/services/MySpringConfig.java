package at.fhtw.swen3.services;

import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.impl.ParcelServiceImpl;
import at.fhtw.swen3.services.mapper.ParcelMapper;
import org.springframework.context.annotation.Bean;

import javax.xml.validation.Validator;

public class MySpringConfig {

    @Bean
    public ParcelService getParcelService(ParcelMapper parcelMapper, MyValidator myValidator){
        return new ParcelServiceImpl(parcelMapper, myValidator);
    }

}
