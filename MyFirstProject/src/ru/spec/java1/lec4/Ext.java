package ru.spec.java1.lec4;

public class Ext extends Base{
	
	String title ="234";
	public Ext( ) {
		System.out.println("Ext( )");
	}
	@Override
	void m() {
		System.out.println("Ext.m( )"+title);
	}

}
