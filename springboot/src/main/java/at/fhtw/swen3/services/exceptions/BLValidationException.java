package at.fhtw.swen3.services.exceptions;

public class BLValidationException extends BLException {
    public BLValidationException(String msg) {
        super(msg);
    }

    public BLValidationException(String msg, Throwable wrap) {
        super(msg, wrap);
    }
}
