package com.modulo.functions;

public class CosFunction implements CalcFunction {
    @Override public String getName() { return "cos"; }
    @Override public String getInsertText() { return "cos("; }
    @Override public double evaluate(double x) { return Math.cos(Math.toRadians(x)); }
}
