package ru.spec.java1.lec4;

public class Ext extends Base{
	
	String title ="234";
	int age =2;
	public Ext( ) {
		System.out.println("Ext( )");
		m();
		super.m();
	}
	@Override
	void m() {
		System.out.println("Ext.m( )"+title);
	}

}
