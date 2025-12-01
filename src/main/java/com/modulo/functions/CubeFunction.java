package com.modulo.functions;

public class CubeFunction implements CalcFunction {
    @Override public String getName() { return "cube"; }
    @Override public String getInsertText() { return "cube("; }
    @Override public double evaluate(double x) { return x * x * x; }
}
