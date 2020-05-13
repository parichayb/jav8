package org.java8p;

//@FunctionalInterface
public interface Service {
	
	public void process(int i) throws InterruptedException;
	
	
	
	public static void processNew(int i) {
		
	};
	
	public default void processAdvanced(int i) {
		System.out.println("test me");
	};
	
	default String toStringNew() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

}
