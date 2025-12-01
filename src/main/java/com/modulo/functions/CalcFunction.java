package com.modulo.functions;

public interface CalcFunction {
    String getName();        // Button label + function identifier
    String getInsertText();  // Inserted text (ex: "sin(")
    double evaluate(double x);
}
