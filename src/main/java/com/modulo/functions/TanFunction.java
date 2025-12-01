package com.modulo.functions;

public class TanFunction implements CalcFunction {
    @Override public String getName() { return "tan"; }
    @Override public String getInsertText() { return "tan("; }
    @Override public double evaluate(double x) { return Math.tan(Math.toRadians(x)); }

}
