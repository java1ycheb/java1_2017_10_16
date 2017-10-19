package ru.spec.java1.lec4;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class TimeTest {
	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		for (int i=0; i<1000_000;i++) {
			list.add(i);
		}

		test();

	}

	private static void test() {
		
		Integer[] array= new Integer[1000_000];
		for (int i=0; i<1000_000;i++) {
			array[i]=1;
		}
		long millis = System.currentTimeMillis();
		long nano = System.nanoTime()/1000_000;
		long ts = System.nanoTime();

	//	long startTime = millis-nano;
	//	System.out.println(new Date(startTime ));
	//	System.out.println(System.currentTimeMillis() - millis);
		System.out.println((System.nanoTime() - ts)/1000/1000d +"ms");
	}
}
