package at.fhtw.swen3.utils;

public class HttpResponse {
    private final String body;
    private final int code;

    public HttpResponse(int code, String body) {
        this.code = code;
        this.body = body;
    }

    public int getCode() {
        return code;
    }

    public String getBody() {
        return body;
    }
}
