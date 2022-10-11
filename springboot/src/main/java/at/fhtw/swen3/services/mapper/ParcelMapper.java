package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.ParcelEntity;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.TrackingInformation;
import at.fhtw.swen3.utils.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParcelMapper extends AbstractMapper<Triple<Parcel, NewParcelInfo, TrackingInformation>, ParcelEntity> {
    @Autowired
    private RecipientMapper recipientMapper;

    @Autowired
    private HopArrivalMapper hopArrivalMapper;

    @Override
    public ParcelEntity mapToTarget(Triple<Parcel, NewParcelInfo, TrackingInformation> object) {
        return ParcelEntity.builder()
                .recipient(recipientMapper.mapToTarget(object.getValue1().getRecipient()))
                .trackingId(object.getValue2().getTrackingId())
                .visitedHops(hopArrivalMapper.mapToTarget(object.getValue3().getVisitedHops()))
                .state(object.getValue3().getState())
                .sender(recipientMapper.mapToTarget(object.getValue1().getSender()))
                .weight(object.getValue1().getWeight())
                .build();
    }

    @Override
    public Triple<Parcel, NewParcelInfo, TrackingInformation> mapToSource(ParcelEntity object) {
        return new Triple<>(
                Parcel.builder()
                    .recipient(recipientMapper.mapToSource(object.getRecipient()))
                    .sender(recipientMapper.mapToSource(object.getSender()))
                    .weight(object.getWeight())
                    .build(),
                NewParcelInfo.builder()
                    .trackingId(object.getTrackingId())
                    .build(),
                TrackingInformation.builder()
                    .futureHops(hopArrivalMapper.mapToSource(object.getFutureHops()))
                    .visitedHops(hopArrivalMapper.mapToSource(object.getVisitedHops()))
                    .state(object.getState())
                    .build());
    }
}