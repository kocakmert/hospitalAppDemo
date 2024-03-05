package hospitalApp.demo.service;


import hospitalApp.demo.entities.HospitalEntity;
import hospitalApp.demo.repository.HospitalRepository;
import hospitalApp.demo.service.Implementation.HospitalServiceImpl;
import hospitalApp.demo.util.results.BaseResponse;
import hospitalApp.demo.web.request.RequestAddHospital;
import hospitalApp.demo.web.request.RequestDeleteHospital;
import hospitalApp.demo.web.response.ResponseHospital;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class HospitalServiceImplTest {

    @InjectMocks
    private HospitalServiceImpl service;

    @Mock
    private HospitalRepository hospitalRepository;


    @Test
    void test_GetAll(){
        ResponseHospital reponse = service.getAll();

        assertNotNull(reponse);
    }

    @ParameterizedTest
    @ValueSource(strings = {"new","updated"})
    void test_addHospital(String parameter){
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setMessage("TST");

        RequestAddHospital request = new RequestAddHospital();
        HospitalEntity hospitalEntity = new HospitalEntity();

        if(parameter.equals("updated")){
            hospitalEntity.setHospitalId(1L);
        }
        hospitalEntity.setHospitalAdress("Test");
        hospitalEntity.setHospitalName("TST");
        hospitalEntity.setHospitalType(1);
        hospitalEntity.setPatient(new ArrayList<>());
        request.setHospital(hospitalEntity);

        if(parameter.equals("updated")){
            Optional<HospitalEntity> optional = Optional.of(new HospitalEntity());
            optional.get().setHospitalId(1L);
            optional.get().setHospitalAdress("Test");
            optional.get().setHospitalName("TST");
            optional.get().setHospitalType(1);
            optional.get().setPatient(new ArrayList<>());
            Mockito.when(hospitalRepository.findById(Mockito.any())).thenReturn(optional);
        }

        response = service.addHospital(request);
        assertNotNull(response);
    }

    @Test
    void test_DeleteHospital(){
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setMessage("TST");

        RequestDeleteHospital request = new RequestDeleteHospital();
        request.setId(1L);

        Optional<HospitalEntity> optional = Optional.of(new HospitalEntity());
        optional.get().setHospitalId(1L);
        optional.get().setHospitalAdress("Test");
        optional.get().setHospitalName("TST");
        optional.get().setHospitalType(1);
        optional.get().setPatient(new ArrayList<>());
        Mockito.when(hospitalRepository.findById(Mockito.any())).thenReturn(optional);

        response = service.deleteHospital(request);
        assertNotNull(response);
    }

}
