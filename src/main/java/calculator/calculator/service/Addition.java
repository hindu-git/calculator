package calculator.calculator.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class Addition {

    public Integer additionService(String a, String b){
        return Integer.parseInt(a)+Integer.parseInt(b);
    }
}
