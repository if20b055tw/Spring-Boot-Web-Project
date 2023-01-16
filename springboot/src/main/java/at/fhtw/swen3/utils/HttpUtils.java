package at.fhtw.swen3.utils;

import at.fhtw.swen3.services.dto.GeoCoordinate;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUtils {
    public static HttpResponse makeHttpRequest(String urlString, String method) throws Exception {
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(method);
        StringBuilder body = new StringBuilder();
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while (null != (line = in.readLine())) {
            body.append(line).append("\n");
        }

        return new HttpResponse(conn.getResponseCode(), body.toString());
        /*int code = conn.getResponseCode();
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
    }
}
