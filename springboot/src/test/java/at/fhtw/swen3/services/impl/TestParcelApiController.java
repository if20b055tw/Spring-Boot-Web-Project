package at.fhtw.swen3.services.impl;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestParcelApiController {

    /*private final ParcelMapper parcelMapper;
    private final NewParcelInfoMapper newParcelInfoMapper;
    private final TrackingInformationMapper trackingInformationMapper;

    private final NativeWebRequest nativeWebRequest;

    private String getGoodTrackingId() {
        return "AJB52VG5F";
    }

    private String getBadTrackingId() {
        return "ABCDE";
    }

    private String getMissingTrackingId() {
        return "AJB52FFFF";
    }

    public TestParcelApiController() {

        this.parcelMapper = ParcelMapper.INSTANCE;
        this.newParcelInfoMapper = NewParcelInfoMapper.INSTANCE;
        this.trackingInformationMapper = TrackingInformationMapper.INSTANCE;

        this.nativeWebRequest = null;
    }

    private ParcelApi getParcelApi(ParcelService mockedParcelService) {
        return new ParcelApiController(nativeWebRequest, mockedParcelService,
                parcelMapper, newParcelInfoMapper, trackingInformationMapper);
    }

    @Test
    public void testReportParcelDelivery() {
        ParcelService parcelService = Mockito.mock(ParcelService.class);
        Mockito.when(parcelService.reportParcelDelivery(
                getGoodTrackingId())).thenReturn(ActionResult.Result.NO_ERROR);
        ParcelApi parcelApi = getParcelApi(parcelService);
        ResponseEntity<Void> expected = new ResponseEntity<>(HttpStatus.OK);

        ResponseEntity<Void> response = parcelApi.reportParcelDelivery(getGoodTrackingId());

        Assertions.assertEquals(expected, response);
    }

    @Test
    public void testReportParcelDeliveryError() {
        ParcelService parcelService = Mockito.mock(ParcelService.class);
        Mockito.when(parcelService.reportParcelDelivery(
                getBadTrackingId())).thenReturn(ActionResult.ERROR);
        ParcelApi parcelApi = getParcelApi(parcelService);
        ResponseEntity<Void> expected = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        ResponseEntity<Void> response = parcelApi.reportParcelDelivery(getBadTrackingId());

        Assertions.assertEquals(expected, response);
    }

    @Test
    public void testReportParcelDeliveryMissing() {
        ParcelService parcelService = Mockito.mock(ParcelService.class);
        Mockito.when(parcelService.reportParcelDelivery(
                getMissingTrackingId())).thenReturn(ActionResult.MISSING);
        ParcelApi parcelApi = getParcelApi(parcelService);
        ResponseEntity<Void> expected = new ResponseEntity<>(HttpStatus.NOT_FOUND);

        ResponseEntity<Void> response = parcelApi.reportParcelDelivery(getMissingTrackingId());

        Assertions.assertEquals(expected, response);
    }

    @Test
    public void testReportParcelHop() {

    }

    @Test
    public void testSubmitParcel() {

    }

    @Test
    public void testTrackParcel() {

    }

    @Test
    public void testTransitionParcel() {

    }*/
}
