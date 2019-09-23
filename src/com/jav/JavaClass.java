package com.jav;

import org.test.Besant;

public class JavaClass {

	public static void main(String[] args) {

		String s = "  sha naz  ";
		System.out.println("Index of");
		int i = s.indexOf("a");
		System.out.println(i);
		
		System.out.println("Last Index of");
		int i1 = s.lastIndexOf("a");
		System.out.println(i1);
		
		System.out.println("Substring - index");
		String s1 = s.substring(3);
		System.out.println(s1);
		
		System.out.println("Substring - Starts with & Ends with");
		String s2 = s.substring(1,4);
		System.out.println(s2);
		
		System.out.println("Trim");
		String t = s.trim();
		System.out.println(t);
		
		
		
	
		
		
	
	}

}
