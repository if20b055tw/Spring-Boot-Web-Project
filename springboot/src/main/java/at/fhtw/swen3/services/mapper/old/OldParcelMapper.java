package at.fhtw.swen3.services.mapper.old;

import at.fhtw.swen3.persistence.entity.old.ParcelEntity;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.TrackingInformation;
import at.fhtw.swen3.services.mapper.AbstractMapper;
import at.fhtw.swen3.utils.Triple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OldParcelMapper extends AbstractMapper<Triple<Parcel, NewParcelInfo, TrackingInformation>, ParcelEntity> {
    @Autowired
    private OldRecipientMapper oldRecipientMapper;

    @Autowired
    private OldHopArrivalMapper oldHopArrivalMapper;

    @Override
    public ParcelEntity mapToTarget(Triple<Parcel, NewParcelInfo, TrackingInformation> object) {
        return ParcelEntity.builder()
                .recipient(oldRecipientMapper.mapToTarget(object.getValue1().getRecipient()))
                .trackingId(object.getValue2().getTrackingId())
                .visitedHops(oldHopArrivalMapper.mapToTarget(object.getValue3().getVisitedHops()))
                .state(object.getValue3().getState())
                .sender(oldRecipientMapper.mapToTarget(object.getValue1().getSender()))
                .weight(object.getValue1().getWeight())
                .build();
    }

    @Override
    public Triple<Parcel, NewParcelInfo, TrackingInformation> mapToSource(ParcelEntity object) {
        return new Triple<>(
                new Parcel()
                    .recipient(oldRecipientMapper.mapToSource(object.getRecipient()))
                    .sender(oldRecipientMapper.mapToSource(object.getSender()))
                    .weight(object.getWeight()),
                new NewParcelInfo()
                    .trackingId(object.getTrackingId()),
                new TrackingInformation()
                    .futureHops(oldHopArrivalMapper.mapToSource(object.getFutureHops()))
                    .visitedHops(oldHopArrivalMapper.mapToSource(object.getVisitedHops()))
                    .state(object.getState()));
    }
}