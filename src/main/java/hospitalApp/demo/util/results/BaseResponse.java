package hospitalApp.demo.util.results;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse {
    private Boolean success;
    private String message;
}
