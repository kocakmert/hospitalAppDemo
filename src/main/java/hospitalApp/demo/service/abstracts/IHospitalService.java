package hospitalApp.demo.service.abstracts;

import hospitalApp.demo.util.results.BaseResponse;
import hospitalApp.demo.web.request.RequestAddHospital;
import hospitalApp.demo.web.request.RequestDeleteHospital;
import hospitalApp.demo.web.response.ResponseHospital;

public interface IHospitalService {

    ResponseHospital getAll();
    BaseResponse addHospital(RequestAddHospital request );

    BaseResponse deleteHospital(RequestDeleteHospital request);
}
