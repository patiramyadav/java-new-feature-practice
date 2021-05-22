package org.patiram.stream;

import org.patiram.helper.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Input:
 * Arrays.asList(new Employee("1", "test1  "), new Employee("2", "test"));
 * Output:
 * {1=org.patiram.helper.Employee@448139f0, 2=org.patiram.helper.Employee@7cca494b}
 * {1=test1  , 2=test}
 */
public class ListToMap {
    public static void main(String[] args) {
        List<Employee> input = Arrays.asList(new Employee("1", "test1  "), new Employee("2", "test"));

        Map<String, Employee> idToObject = input.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
        Map<String, String> idToName = input.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));

        System.out.println(idToObject);
        System.out.println(idToName);
    }
}
