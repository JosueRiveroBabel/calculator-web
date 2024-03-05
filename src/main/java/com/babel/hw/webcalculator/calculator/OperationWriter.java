package com.babel.hw.webcalculator.calculator;

public class OperationWriter {
    private String operation;
    private Double operator1;
    private Double operator2;
    private Double result;

    public OperationWriter(String operation, Double operator1, Double operator2, Double result) {
        this.operation = operation;
        this.operator1 = operator1;
        this.operator2 = operator2;
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double getOperator1() {
        return operator1;
    }

    public void setOperator1(Double operator1) {
        this.operator1 = operator1;
    }

    public Double getOperator2() {
        return operator2;
    }

    public void setOperator2(Double operator2) {
        this.operator2 = operator2;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
