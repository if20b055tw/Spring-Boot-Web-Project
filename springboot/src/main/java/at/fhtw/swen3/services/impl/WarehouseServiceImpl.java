package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.entities.*;
import at.fhtw.swen3.persistence.repositories.*;
import at.fhtw.swen3.services.dto.Hop;
import at.fhtw.swen3.services.dto.Warehouse;
import at.fhtw.swen3.services.exceptions.BLDataNotFoundException;
import at.fhtw.swen3.services.exceptions.BLException;
import at.fhtw.swen3.services.mapper.HopMapper;
import at.fhtw.swen3.services.mapper.WarehouseMapper;
import at.fhtw.swen3.services.validation.MyValidator;
import at.fhtw.swen3.utils.ActionResult;
import at.fhtw.swen3.utils.Pair;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
public class WarehouseServiceImpl implements WarehouseService {

    private final MyValidator myValidator;

    private final WarehouseMapper warehouseMapper;
    private final WarehouseRepository warehouseRepository;
    private final GeoCoordinateRepository geoCoordinateRepository;
    private final WarehouseNextHopsRepository warehouseNextHopsRepository;
    private final HopRepository hopRepository;
    private final TransferwarehouseRepository transferwarehouseRepository;
    private final TruckRepository truckRepository;
    private final HopMapper hopMapper;

    //private Long lastId;

    private static final int ROOT_LEVEL = 0;

    @Override
    @Transactional
    public Warehouse exportWarehouses() throws BLException {
        log.info("Calling: exportWarehouses()");

        try {
            List<WarehouseEntity> warehouseEntity = warehouseRepository.findByLevel(ROOT_LEVEL);
            if (0 != warehouseEntity.size()) {
                return warehouseMapper.mapToSource(warehouseEntity.get(0));
//                return new Pair<>(warehouse, new ActionResult(ActionResult.Result.NO_ERROR));
            } else {
                throw new BLDataNotFoundException("no warehouse hierarchy found");
//                return new Pair<>(null, new ActionResult(ActionResult.Result.MISSING));
            }
        } catch (BLDataNotFoundException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            //return new Pair<>(null, new ActionResult(ActionResult.Result.ERROR));
            throw new BLException("unknown error", e);
        }
    }

    @Override
    @Transactional
    public Hop getWarehouse(String code) throws BLException {
        log.info("get the Warehouse or truck with Code: " + code);

        try {
            Optional<HopEntity> hopEntity = hopRepository.findByCode(code);
            if (hopEntity.isPresent()) {
                return hopMapper.mapToSource(hopEntity.get());
//                return new Pair<>(hop, new ActionResult(ActionResult.Result.NO_ERROR));
            } else {
                throw new BLDataNotFoundException("warehouse or truck not found");
//                return new Pair<>(null, new ActionResult(ActionResult.Result.MISSING));
            }
        } catch (BLDataNotFoundException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
//            return new Pair<>(null, new ActionResult(ActionResult.Result.ERROR));
            throw new BLException("unknown error", e);
        }
    }

    @Override
    public void importWarehouses(Warehouse warehouse) throws BLException {
        log.info("Calling: importWarehouses");
        try {
            /*warehouseRepository.deleteAll();
            WarehouseEntity warehouseEntity = warehouseMapper.mapToTarget(warehouse);
            GeoCoordinateEntity geoCoordinateEntity = warehouseEntity.getLocationCoordinates();
            List<WarehouseNextHopsEntity> warehouseNextHopsEntities = warehouseEntity.getNextHops();
            for (WarehouseNextHopsEntity e : warehouseNextHopsEntities) {
                HopEntity hopEntity = e.getHop();
                if (hopEntity instanceof TransferwarehouseEntity) {
                    transferwarehouseRepository.save((TransferwarehouseEntity) hopEntity);
                } else if (hopEntity instanceof TruckEntity) {
                    truckRepository.save((TruckEntity) hopEntity);
                } else if (hopEntity instanceof  WarehouseEntity) {

                }
                geoCoordinateRepository.save(hopEntity.getLocationCoordinates());
                hopRepository.save(hopEntity);
            }
            warehouseNextHopsRepository.saveAll(warehouseNextHopsEntities);
            geoCoordinateRepository.save(geoCoordinateEntity);
            warehouseRepository.save(warehouseEntity);*/
            WarehouseEntity warehouseEntity = warehouseMapper.mapToTarget(warehouse);
            //saveWarehouse(warehouseEntity);
            warehouseRepository.deleteAll();
            WarehouseEntity savedEntity = warehouseRepository.save(warehouseEntity);
            //lastId = savedEntity.getId();
//            return new ActionResult(ActionResult.Result.NO_ERROR);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BLException("unknown error", e);
//            return new ActionResult(ActionResult.Result.ERROR);
        }
    }
}
