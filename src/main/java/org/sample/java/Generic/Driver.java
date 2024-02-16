package org.sample.java.Generic;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        List<Integer> numbers = new Random()
            .ints(1, 500)
            .distinct()
            .limit(100)
            .boxed().sorted()
            .collect(Collectors.toList());

        numbers.forEach(System.out::println);

        Crate<Box<Integer>> crate = new Crate<>();

        numbers.forEach(number -> crate.addBox(new Box<>(number)));

        System.out.println(crate);

    }
}
