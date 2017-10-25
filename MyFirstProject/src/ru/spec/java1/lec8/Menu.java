package ru.spec.java1.lec8;

public enum Menu implements Runnable {
	MAIN("�������"),
	PROJECTS("������"){
		@Override
		public void run() {
			System.out.println("Hello  world");
		}
	},
	PROJECT_1("������1",PROJECTS),
	PROJECT_1_1("������11",PROJECTS),
	PROJECTS_2("������2",PROJECTS),
	PROJECTS_3("������3",PROJECTS),
	ABOUT("� ���"),
	CONTACTS("��������");
	
	String title;
	Menu parent;
	
	private Menu(String title,Menu parent) {
		this.title = title;
		this.parent = parent;
	}
	private Menu(String title) {
		this(title,null); 
	}
	
	@Override
	public String toString() {
		return (parent==null?"":parent.toString()+" >> ") +title;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
