package com.babel.hw.webcalculator.calculator.operations;

import org.springframework.stereotype.Component;

@Component("suma")
public class Suma implements Operation {

    @Override
    public Integer id() {
        return 1;
    }

    @Override
    public String description() {
        return "suma";
    }

    public Suma(){}
    @Override
    public double calculate(double operand1, double operand2) {
        return operand1 + operand2;
    }
}