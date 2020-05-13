package org.java8p;

public class ServiceImpl implements Service {

	@Override
	public void processAdvanced(int i) {
		System.out.println("Overridden advanced");

	}

	@Override
	public void process(int i) {
		System.out.println("Overridden process");
	}


}
