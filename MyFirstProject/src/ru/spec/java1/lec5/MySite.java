package ru.spec.java1.lec5;

public class MySite implements Site {

	@Override
	public String getName() {
		
		return "MySite";
	}
	
	public static void main(String[] args) {
		System.out.println(new MySite().getTitle());
	}
}
