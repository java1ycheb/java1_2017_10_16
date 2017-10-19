package ru.spec.java1.lec3;

public class Block {
	int i;
	static int count;
	public Block() {
		System.out.println("new block");
		count++;
	}
	void sayHello() {
		System.out.println("hello"+this.i);
	}
	static void sayBye(Block self) {
		System.out.println("bye" +self);
	}
	public static void main(String[] args) {
		for (int i=0; i<10;i++) {
			 new Block().sayHello();
			System.out.println(Block.count);
		}
	}

}
