package org.java8p.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args) {

        Thread.currentThread().setName("My Thread");

        List<String> lst = Arrays.asList("abcdefgh", "defghi", "", "dqd", "dfwer");
        
        
        Stream<String> s0 = lst.stream();
        Stream<String> s1 = s0.filter(t -> t.length() > 4);
        Stream<String> s2 = s1.map(String::toUpperCase);
        
        s2.forEach(x -> {
            System.out.println("Start");
            System.out.println(x);
            System.out.println("End");
            });

        
        
        
        
        
        lst.stream().filter(t -> t.length() > 4).forEach(System.out::println);
        lst.stream().filter(t -> t.length() > 4).allMatch(t -> t.length() > 4);
        lst.stream().filter(t -> t.length() > 4).anyMatch(t -> t.length() > 6);

        lst.stream().map(t -> t.toUpperCase())
                .forEach(t -> System.out.println(t + "  " + Thread.currentThread().getName()));

        lst.parallelStream().map(t -> t.toUpperCase())
                .forEach(t -> System.out.println(t + "  " + Thread.currentThread().getName()));

        String[] strarr = { "abcdefgh", "defghi", "", "dqd", "dfwer" };

        System.out.println(Stream.<String>of("abcdefgh", "defghi", "", "dqd", "dfwer").distinct().sorted()
                .sorted((t1, t2) -> t1.length() - t2.length()).limit(10)
                .sorted(Comparator.comparing(String::length).reversed()).toArray().toString());

        Object[] powers = Stream.iterate(1.0, p -> p * 2).peek(e -> System.out.println("Fetching " + e)).limit(20)
                .toArray();

        Stream.generate(() -> "Test").toArray();
    }
}
