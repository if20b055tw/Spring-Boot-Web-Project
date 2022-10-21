package at.fhtw.swen3.services;

import at.fhtw.swen3.services.impl.ParcelServiceImpl;
import at.fhtw.swen3.services.mapper.OldParcelMapper;
import org.springframework.context.annotation.Bean;

public class MySpringConfig {

    @Bean
    public ParcelService getParcelService(OldParcelMapper oldParcelMapper, MyValidator myValidator){
        return new ParcelServiceImpl(oldParcelMapper, myValidator);
    }

}
