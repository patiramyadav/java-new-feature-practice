package org.patiram.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

        CalculatorFunctionalInterface prod = (x, y) -> (Integer) x * (Integer) y;
        CalculatorFunctionalInterface sum = (x, y) -> (Double) x + (Double) y;

        System.out.println(prod.calculate(2, 3));
        System.out.println(sum.calculate(5.4, 6.9));

        SortByLengthFuncInterface sl = (s1, s2) -> {
            if(s1.length() > s2.length()) return 1;
            else if(s1.length() == s2.length()) return  0;
            return -1;
        };

        List<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Pati Ram");
        list.add("Shyam");
        System.out.println(list.stream().sorted(sl::sort).collect(Collectors.toList()).toString());

        List<String> abc = new ArrayList<>();
        abc.add("4");
        abc.add("1");
        abc.add("10");
        System.out.println(abc.stream().sorted(FunctionalInterfaceTest::sortInReverse).collect(Collectors.toList()).toString());
    }

    private static int sortInReverse(String s1, String s2){
        return s2.concat(s1).compareTo(s1.concat(s2));
    }
}
