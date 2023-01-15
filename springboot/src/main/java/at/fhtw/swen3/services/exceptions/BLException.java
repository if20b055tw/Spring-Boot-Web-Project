package at.fhtw.swen3.services.exceptions;

public class BLException extends Exception {
    public BLException(String msg) {
        super(msg);
    }

    public BLException(String msg, Throwable wrap) {
        super(msg, wrap);
    }
}
