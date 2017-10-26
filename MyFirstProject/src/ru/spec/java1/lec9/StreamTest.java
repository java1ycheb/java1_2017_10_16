package ru.spec.java1.lec9;

import java.io.IOException;

public class StreamTest {
	public static void main(String[] args) throws IOException {
		System.out.println("Start");
		int[] read = {
				System.in.read(),
				System.in.read(),
				System.in.read(),
				System.in.read(),
				System.in.read(),
		};
		System.out.println("end "+read[0]);
	}
}

