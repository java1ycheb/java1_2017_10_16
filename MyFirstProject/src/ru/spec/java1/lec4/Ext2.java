package ru.spec.java1.lec4;

public class Ext2 extends Ext {
	String title = "456";
			int age =3;
	public Ext2() {
		System.out.println("Ext2()");
		super.m();
	}
	@Override
	void m() {
		System.out.println("Ext2.m( )"+title);
	}
}
