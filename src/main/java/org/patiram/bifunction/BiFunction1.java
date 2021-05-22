package org.patiram.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> b = Math::addExact;
        Function<Integer, Integer> g = (x) -> x + x;
        System.out.println(b.andThen(g).apply(1, 2));
        System.out.println(g.apply(b.apply(1, 2)));
    }
}
