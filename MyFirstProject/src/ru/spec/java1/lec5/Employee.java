package ru.spec.java1.lec5;

public class Employee {
	
	String name;
	String title;
	int age;
	
	final int MAX =100;
	
	// ������������� �������, � ������� ���������
	{
		System.out.println("init");
		
		int age =5;
	}
	
	// ������������� ������ ������ �����
	
	static {
		System.out.println("static init");
	}
	
	public Employee(String name, String title, int age) {
		super();
		this.name = name;
		this.title = title;
		this.age = age;
		System.out.println("Employee");
	}
	public static void main(String[] args) {
		System.out.println("start");
		new Employee("Vasya","123",0);
		System.out.println("stop");
	}


}
