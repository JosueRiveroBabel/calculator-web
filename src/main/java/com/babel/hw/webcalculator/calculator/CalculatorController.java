package com.babel.hw.webcalculator.calculator;

import com.babel.hw.webcalculator.calculator.operations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculatorController {


    @Autowired
    private Calculator calculator;
    @GetMapping("/{operacion}")

    public OperationWriter operate(@PathVariable("operacion") String operationName,
                             @RequestParam("operando1") Double operator1,
                             @RequestParam("operando2") Double operator2){
        return  calculator.calculate(operationName,operator1,operator2);
    }
}
