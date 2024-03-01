package hospitalApp.demo.util.results;

public class ErrorDataResult<T> extends DataResult<T> {

    public ErrorDataResult(T data, String message) {
        super(data, false, message);
    }
}