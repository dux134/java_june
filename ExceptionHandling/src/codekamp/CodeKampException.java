package codekamp;

/**
 * Created by cerebro on 21/06/17.
 */
public class CodeKampException extends Exception {
    String reason;

    CodeKampException(String reason) {
        this.reason = reason;
    }
}
