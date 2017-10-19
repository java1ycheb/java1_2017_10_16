package ru.spec.java1.lec4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class WorldCount {
	public static void main(String[] args) {
		String str="ssdfds   sdfwerq     qwfsdaf    qwerqweqr werqwer werqwer werqwer       werqwer qwrwqrqw qwrqwe";
		String str2="ssdfds   sdfwrq     qwfdaf    qwerqweqr werqwer werqwer werqwer       weqwer qwrrqw qqwe";
		ArrayList<String> strings = new ArrayList<>();
		TreeSet<String> settt = new TreeSet<>();
		
		addWordToArray(str, settt);
		addWordToArray(str2, settt);

		// for (String word : strings) {
		//	System.out.println(word);
	    //		}
		for (String word : settt) {
			System.out.println(word);
		}
			
	}

	private static String[] addWordToArray(String str, TreeSet<String> settt) {
		String[] split=str.trim().split("\\s+");
		settt.addAll(Arrays.asList(split));
		return split;
	}
}
