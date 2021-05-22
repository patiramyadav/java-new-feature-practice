package org.patiram.functionalinterface;

@FunctionalInterface
public interface CalculatorFunctionalInterface<T> {
    public T calculate(T x, T y);
}
