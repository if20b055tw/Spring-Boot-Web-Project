package at.fhtw.swen3.services.exceptions;

public class BLDataNotFoundException extends BLException {
    public BLDataNotFoundException(String msg) {
        super(msg);
    }

    public BLDataNotFoundException(String msg, Throwable wrap) {
        super(msg, wrap);
    }
}
