package org.java8p.streams;

import java.util.stream.Stream;

public class LimitStreams {

	public static void main(String[] args) {
		Stream<Integer> x = Stream.iterate(1, t-> t+1);
	}
}
