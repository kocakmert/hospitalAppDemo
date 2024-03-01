package hospitalApp.demo.util.results;

import javax.xml.crypto.Data;

public class SuccessDataResult<T> extends DataResult<T> {

    public SuccessDataResult(T data, String message) {
        super(data, true, message);
    }
}
