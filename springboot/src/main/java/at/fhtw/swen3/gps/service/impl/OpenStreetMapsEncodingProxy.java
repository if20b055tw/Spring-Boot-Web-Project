package at.fhtw.swen3.gps.service.impl;

import at.fhtw.swen3.gps.service.Address;
import at.fhtw.swen3.gps.service.GeoEncodingService;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import at.fhtw.swen3.services.exceptions.BLException;
import at.fhtw.swen3.utils.HttpResponse;
import at.fhtw.swen3.utils.HttpUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class OpenStreetMapsEncodingProxy implements GeoEncodingService {
    private static final String BASE_URL = "https://nominatim.openstreetmap.org";

    private String buildUrlParams(Address address) {
        try {
            return "street=" + URLEncoder.encode(address.getStreet(), "utf-8") + "&" +
                    "city=" + URLEncoder.encode(address.getCity(), "utf-8") + "&" +
                    "country=" + URLEncoder.encode(address.getCountry(), "utf-8") + "&" +
                    "postalcode=" + URLEncoder.encode(address.getPostalCode(), "utf-8") + "&";
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    private GeoCoordinate restCall(String urlString) throws Exception {
        /*URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        int code = conn.getResponseCode();
        if (200 != code) {
            throw new Exception("rest call failed");
        }
        ObjectMapper om = new ObjectMapper();
        JsonNode node = om.readValue(conn.getInputStream(), JsonNode.class);
        JsonNode a = node.get(0);
        if (null == a) {
            throw new IllegalArgumentException("address not found");
        }
        try {
            double lon = Double.parseDouble(a.get("lon").asText());
            double lat = Double.parseDouble(a.get("lat").asText());
            return new GeoCoordinate().lat(lat).lon(lon);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }*/

        HttpResponse response = HttpUtils.makeHttpRequest(urlString, "GET");
        if (200 != response.getCode()) {
            throw new Exception("rest call failed");
        }
        ObjectMapper om = new ObjectMapper();
        JsonNode node = om.readValue(response.getBody(), JsonNode.class);
        JsonNode a = node.get(0);
        if (null == a) {
            throw new IllegalArgumentException("address not found");
        }
        try {
            double lon = Double.parseDouble(a.get("lon").asText());
            double lat = Double.parseDouble(a.get("lat").asText());
            return new GeoCoordinate().lat(lat).lon(lon);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public GeoCoordinate encodeAddress(Address address) throws BLException {
        String url = BASE_URL + "/search?" + buildUrlParams(address) + "&format=json&limit=1";
        try {
            return restCall(url);
        } catch (Exception e) {
            throw new BLException(e.getMessage(), e);
        }
    }
}
