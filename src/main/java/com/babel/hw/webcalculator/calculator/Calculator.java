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
            return null;
        }
    }


//    public void run() {
//        int operacionSeleccionada = -1;
//
//        Scanner scanner = new Scanner(System.in);
//
//        operacionSeleccionada = getOpciones();
//        while (operacionSeleccionada != 0) {
//            double operando1 = getOperando();
//            double operando2 = getOperando();
//
//            Operation selectedOperation = operacionesDisponibles.get(operacionSeleccionada);
//
//            if (selectedOperation != null) {
//                res = selectedOperation.calculate(operando1, operando2);
//            } else {
//                System.out.println("Opción no válida.");
//            }
//            getRes();
//            operacionSeleccionada = getOpciones();
//
//        }
}