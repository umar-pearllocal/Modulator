package com.modulo.functions;

public class LogFunction implements CalcFunction {
    @Override public String getName() { return "log"; }
    @Override public String getInsertText() { return "log("; }
    @Override public double evaluate(double x) { return Math.log10(x); }
}
