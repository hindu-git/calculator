package calculator.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import calculator.calculator.service.Addition;
import calculator.calculator.service.Multiplication;


@RestController
public class Calculator {

    @Autowired
    private Addition addition;
@Autowired
    private Multiplication multiplication;
    @GetMapping("/welcome/{name}")
    public String wishGreetings(@PathVariable String name){
        return  "welcome "+name+", good evening";
    }
    @GetMapping("/add/{firstNumber}/{secondNumber}")
    public Integer addition(@PathVariable String firstNumber,@PathVariable String secondNumber){
        return  addition.additionService(firstNumber,secondNumber);
    }
@GetMapping("/mul/{firstNumber}/{secondNumber}")
    public Integer multiplicatio(@PathVariable String firstNumber,@PathVariable String secondNumber){
        return  multiplication.multiplicationService(firstNumber,secondNumber);
    }
}
