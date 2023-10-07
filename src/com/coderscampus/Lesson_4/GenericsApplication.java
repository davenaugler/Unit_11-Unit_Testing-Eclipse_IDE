package com.coderscampus.Lesson_4;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GenericsApplication {
	
	@Test
	public void generics_examples() {
		
		List list = new ArrayList();
		
		list.add("first string value");
		list.add("second string value");
		list.add("E");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((String)list.get(i));
		}
		
	}
	
	@Test
	public void more_generics_examples() {
		// Leverage generic's inside your code
		// Need to specify type
		MyPair<Integer, String> myPair = new MyPair<>(1, "3");
		int key = myPair.getKey();
		String value = myPair.getValue();
		System.out.println("-----");
		System.out.println(key + " " + value);
		System.out.println("-----");
		
	}

}