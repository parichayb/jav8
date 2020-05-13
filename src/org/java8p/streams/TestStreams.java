package org.java8p.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreams {

	public static void main(String[] args) {
		
		Thread.currentThread().setName("My Thread");
		
		
		List<String> lst = Arrays.asList("abcdefgh", "defghi","","dqd","dfwer");
		
		lst.stream().filter(t -> t.length() > 4).forEach(System.out::println);
		lst.stream().filter(t -> t.length() > 4).allMatch(t -> t.length() > 4);
		lst.stream().filter(t -> t.length() > 4).anyMatch(t -> t.length() > 6);

		lst.stream().map(t -> t.toUpperCase()).forEach(t -> System.out.println(t + "  " + Thread.currentThread().getName()));
		
		lst.parallelStream().map(t -> t.toUpperCase()).forEach(t -> System.out.println(t + "  " + Thread.currentThread().getName()));
		
		String[] strarr = {"abcdefgh", "defghi","","dqd","dfwer"};
		Stream.<String>of("abcdefgh", "defghi","","dqd","dfwer");
	}
}
