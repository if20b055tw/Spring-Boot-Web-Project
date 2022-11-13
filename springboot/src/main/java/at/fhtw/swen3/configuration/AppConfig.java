package at.fhtw.swen3.configuration;

import at.fhtw.swen3.services.impl.ParcelService;
import at.fhtw.swen3.services.impl.WarehouseService;
import at.fhtw.swen3.services.impl.ParcelServiceImpl;
import at.fhtw.swen3.services.impl.WarehouseServiceImpl;
import at.fhtw.swen3.services.mapper.*;
import at.fhtw.swen3.services.validation.MyValidator;
import at.fhtw.swen3.utils.JPAUtil;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
public class AppConfig {
    /*@Bean
    public ParcelApi getParcelApi(NativeWebRequest nativeWebRequest,
                                  ParcelService parcelService, ParcelMapper parcelMapper,
                                  NewParcelInfoMapper newParcelInfoMapper,
                                  TrackingInformationMapper trackingInformationMapper) {
        return new ParcelApiController(nativeWebRequest, parcelService, parcelMapper,
                newParcelInfoMapper, trackingInformationMapper);
    }

    @Bean
    public WarehouseApi getWarehouseApi(NativeWebRequest nativeWebRequest, WarehouseService warehouseService,
                                        WarehouseMapper warehouseMapper, HopMapper hopMapper) {
        return new WarehouseApiController(nativeWebRequest, warehouseService, warehouseMapper, hopMapper);
    }*/

    /*@Bean
    public EntityManagerFactory getEntityManagerFactory() {
        return JPAUtil.getEntityManagerFactory();
    }*/

    /*@Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/swkom_db");
        dataSourceBuilder.username("swkom_user");
        dataSourceBuilder.password("mypasswd");
        return dataSourceBuilder.build();
    }*/

    @Bean
    public ParcelService getParcelService(MyValidator myValidator){
        return new ParcelServiceImpl(myValidator);
    }

    @Bean
    public WarehouseService getWarehouseService(MyValidator myValidator) {
        return new WarehouseServiceImpl(myValidator);
    }

    @Bean
    public ParcelMapper getParcelMapper() {
        return ParcelMapper.INSTANCE;
    }

    @Bean
    public NewParcelInfoMapper getNewParcelInfoMapper() {
        return NewParcelInfoMapper.INSTANCE;
    }

    @Bean
    public TrackingInformationMapper getTrackingInformationMapper() {
        return TrackingInformationMapper.INSTANCE;
    }

    @Bean
    public WarehouseMapper getWarehouseMapper() {
        return WarehouseMapper.INSTANCE;
    }

    @Bean
    public HopMapper getHopMapper() {
        return HopMapper.INSTANCE;
    }

    @Bean
    public MyValidator getMyValidator() {
        return new MyValidator();
    }
}
