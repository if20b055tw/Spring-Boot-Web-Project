package at.fhtw.swen3.utils;

public class ActionResult {
    public enum Result {
        NO_ERROR,
        ERROR,
        MISSING
    }

    private final Result result;
    private final String message;

    public ActionResult() {
        result = Result.NO_ERROR;
        message = "";
    }

    public ActionResult(Result result) {
        this.result = result;
        message = "";
    }

    public ActionResult(Result result, String message) {
        this.result = result;
        this.message = message;
    }

    public Result getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }
}
