package com.babel.hw.webcalculator.calculator.operations;

import org.springframework.stereotype.Component;

@Component("division")
public class Division implements Operation{


    @Override
    public Integer id() {
        return 4;
    }

    @Override
    public String description() {
        return "divison";
    }

    @Override
    public double calculate(double operand1, double operand2) {
        if (operand2 == 0) {
            System.out.println("No se puede dividir por cero.");
            System.exit(1);
        }
        return operand1 / operand2;
    }
}