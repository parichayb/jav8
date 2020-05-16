package org.java8p;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * 
 * How default interface methods helps java backward compatibility
 * 
 * 123
 * 
 * more comments added here 
 * 
 */
public class TestMe {

	public static void main(String[] args) {
		
		Thread.currentThread().setName("My Thread");
		
		List<String> lst = Arrays.asList("abc", "def");
		
		
		Consumer<String> action = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		
		
		
		
		lst.forEach(action);
	
		lst.forEach(System.out::println);
		
		lst.forEach(t -> System.out.println(t));
	}
}
