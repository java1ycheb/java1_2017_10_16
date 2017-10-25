package ru.spec.java1.lec8;

public class ErrorTest {
	public static void main(String[] args)  {
		System.out.println("START");
		
		try {
			int i = 5/0;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("END");
	}

}
