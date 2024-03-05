package com.babel.hw.webcalculator.calculator.operations;

import org.springframework.stereotype.Component;

@Component("multiplicacion")
public class Multiplicacion implements Operation {

    @Override
    public Integer id() {
        return 3;
    }

    @Override
    public String description() {
        return "multiplicacion";
    }

    @Override
    public double calculate(double operand1, double operand2) {
        return operand1 * operand2;
    }
}