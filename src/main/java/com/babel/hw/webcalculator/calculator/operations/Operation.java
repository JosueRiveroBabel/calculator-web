package com.babel.hw.webcalculator.calculator.operations;

public interface Operation {
    Integer id();
    String description();
    double calculate(double operand1, double operand2);
}
