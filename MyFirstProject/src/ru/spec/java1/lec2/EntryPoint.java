package ru.spec.java1.lec2;

import java.math.*;

public class EntryPoint {
	public static void main(String[] args) {
	 fib();
	 System.out.println(Math.pow(2.5,3.3332));

	 int[] array = new int[] {1,2,3,4,5};
	 for (int i : array) {
		 
		 System.out.println(i);
		
	}
}

	private static void fib() {
		BigInteger i1 = new BigInteger("1"), i2 = new BigInteger("1"),i3; 
		 for (int i=1; i<=10; i++) {
			 System.out.println("("+i+")=" + i1);
			 i3 = i1.add(i2);
			 i1 =i2;
			 i2 = i3;
		 }
	}
}
