package com.modulo.functions;

public class SqrtFunction implements CalcFunction {
    @Override public String getName() { return "sqrt"; }
    @Override public String getInsertText() { return "sqrt("; }
    @Override public double evaluate(double x) { return Math.sqrt(x); }
}
