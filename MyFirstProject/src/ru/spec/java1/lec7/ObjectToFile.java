package ru.spec.java1.lec7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectToFile {
	public static void main(String[] args) throws Exception {
		File f = new File ("c:/java/obj.bin");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Date());		
		
		FileInputStream fileInputStream = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fileInputStream);
		Object d = ois.readObject();
		System.out.println(d.getClass().getName());
		System.out.println(d);
	}

}
