package com.babel.hw.webcalculator.calculator.operations;

import org.springframework.stereotype.Component;

@Component("resta")
public class Resta implements Operation{
    @Override
    public Integer id() {
        return 2;
    }

    @Override
    public String description() {
        return "resta";
    }

    @Override
    public double calculate(double operand1, double operand2) {
        return operand1 - operand2;
    }
}