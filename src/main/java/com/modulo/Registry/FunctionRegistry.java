package com.modulo.Registry;


import com.modulo.functions.CalcFunction;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FunctionRegistry {

    private static final List<CalcFunction> functions = new ArrayList<>();

    public static List<CalcFunction> getFunctions() {
        return functions;
    }

    // Auto-scan all classes in com.modulo.functions
    public static void loadFunctions() {
        try {
            Reflections reflections = new Reflections("com.modulo.functions");
            Set<Class<? extends CalcFunction>> classes = reflections.getSubTypesOf(CalcFunction.class);

            for (Class<? extends CalcFunction> cls : classes) {
                if (!cls.isInterface()) {
                    functions.add(cls.getDeclaredConstructor().newInstance());
                }
            }
        } catch (Exception e) {
            System.err.println("Failed loading plugins: " + e.getMessage());
        }
    }
}
