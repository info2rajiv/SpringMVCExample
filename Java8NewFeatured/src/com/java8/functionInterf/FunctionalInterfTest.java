package com.java8.functionInterf;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> l = new ArrayList();
		l.add("shiva");

		l.forEach(sub -> System.out.println(sub));
	}

}
