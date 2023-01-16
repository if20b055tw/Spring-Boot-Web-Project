package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entities.HopEntity;
import at.fhtw.swen3.persistence.entities.TransferwarehouseEntity;
import at.fhtw.swen3.persistence.entities.TruckEntity;
import at.fhtw.swen3.persistence.entities.WarehouseEntity;
import at.fhtw.swen3.services.dto.Hop;
import at.fhtw.swen3.services.dto.Transferwarehouse;
import at.fhtw.swen3.services.dto.Truck;
import at.fhtw.swen3.services.dto.Warehouse;

public abstract class HopMapperDecorator extends HopMapper {
        private final HopMapper delegate;

        protected HopMapperDecorator(HopMapper delegate) {
            this.delegate = delegate;
        }

        @Override
        public HopEntity mapToTarget(Hop hop) {
            if (hop instanceof Transferwarehouse) {
                return TransferwarehouseMapper.INSTANCE.mapToTarget((Transferwarehouse) hop);
            } else if (hop instanceof Truck) {
                return TruckMapper.INSTANCE.mapToTarget((Truck) hop);
            } else if (hop instanceof Warehouse) {
                return WarehouseMapper.INSTANCE.mapToTarget((Warehouse) hop);
            }
            return delegate.mapToTarget(hop);
        }

        @Override
        public Hop mapToSource(HopEntity hop) {
            if (hop instanceof TransferwarehouseEntity) {
                return TransferwarehouseMapper.INSTANCE.mapToSource((TransferwarehouseEntity) hop);
            } else if (hop instanceof TruckEntity) {
                return TruckMapper.INSTANCE.mapToSource((TruckEntity) hop);
            } else if (hop instanceof WarehouseEntity) {
                return WarehouseMapper.INSTANCE.mapToSource((WarehouseEntity) hop);
            }
            return delegate.mapToSource(hop);
        }
    }
