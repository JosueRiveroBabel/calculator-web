package com.babel.hw.webcalculator.calculator;

import com.babel.hw.webcalculator.calculator.operations.Operation;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Service
public class Calculator {

    private double res;

    private final Map<String, Operation> operacionesDisponibles = new HashMap<>();

    public Calculator(List<Operation> operaciones) {
        for (Operation operation : operaciones) {
            this.operacionesDisponibles.put(operation.description(), operation);
        }
    }

    public Operation getOperation(String nameOperation) {
        Operation operation = operacionesDisponibles.get(nameOperation);
        if (operation != null) {
            return operation;
        }
        else {
            throw new IllegalArgumentException("Operacion no soportada");
        }
    }

    public OperationWriter calculate(String operationName, Double operator1, Double operator2){
        Operation operation = getOperation(operationName);
        Double result = operation.calculate(operator1,operator2);
        return new OperationWriter(operationName, operator1, operator2, result);
    }


}