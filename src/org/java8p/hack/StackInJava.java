package org.java8p.hack;

import java.util.Stack;

public class StackInJava {

	public static void main(String[] args) {
		System.out.println("Start");
		
		assert  isBalanced("{}()") == true;
		assert  isBalanced("{}())") == false;
		assert  isBalanced("{)}())") == false;
		assert  isBalanced("{((({})))}()") == true;
		assert  isBalanced("") == false;
		assert  isBalanced(")(") == false;
		assert  isBalanced("{}()}{") == false;
		System.out.println("End");
	}

	private static boolean isBalanced(String str) {
		
		if(str.isEmpty() || str.length() % 2 != 0)
			return false;
		
		
		boolean result = false;
		Stack<Character> st = new Stack<Character>();
		char[] chArr = str.toCharArray();
		for(char ch : chArr) {
			if(st.isEmpty())
				st.push(ch);
			else {
				if("()".equals(st.peek() + "" + ch) ||  "{}".equals(st.peek() + "" + ch)) {
					st.pop();
				}else
					st.push(ch);
			}
		}
		if(st.isEmpty())
			result = true;
		
		return result;
	}
	
	
}
