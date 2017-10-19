package ru.spec.java1.lec2;

import java.util.Date;

public class testo {
	public static void main(String[] args) {
		Object o = new Date();
		System.out.println(o.getClass().getName());
		
		int re = 5;
		Object[] array = {new Date(),re,'a'};
		Object[][] matrix = new Object[re][1];
		String str = "hello world";
		System.out.println("hello world " == str.intern());
		System.out.println("str"+'a');
		
		Integer i1,i2;
		for (int i=200; i>-200;i--) {
			i1=i;
			i2=i;
			System.out.println(i+"i1==i2?"  + (i1==i2) );
		}

	}
}
