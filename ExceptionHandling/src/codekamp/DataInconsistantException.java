package codekamp;

/**
 * Created by cerebro on 21/06/17.
 */
public class DataInconsistantException extends Exception {

    public String message;

    public DataInconsistantException(String msg) {
        this.message = msg;
    }
}
