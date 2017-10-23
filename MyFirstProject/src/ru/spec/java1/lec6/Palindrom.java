package ru.spec.java1.lec6;

public class Palindrom {

	public static void main(String[] args) {
		//for (int i = 0; i< 100000 ; i++) {
			//if (isPalendrom(i,7) && isPalendrom(i,17) ) {
			//	System.out.println("("
			//			+ i
			//			+ ") "
			//			+Long.toString(i,7)
				//		+" "
				//		+Long.toString(i,17));
		//	}
	//	}
		for (int i = 0; i< 10 ; i++) {
		test1();
		test2();
		test3();
		}
	}
	private static void test1() {
		long ts = System.nanoTime();
		for (int i = 0; i< 10000000 ; i++) {
			isPalen("asdfgqokjeklwqje");
		}
		System.out.println((System.nanoTime() - ts)/1000/1000d +"ms");
	}
	private static void test2() {
		long ts = System.nanoTime();
		for (int i = 0; i< 10000000 ; i++) {
			isPalendrom2("asdfgqokjeklwqje");
		}
		System.out.println((System.nanoTime() - ts)/1000/1000d +"ms");
	}
	private static void test3() {
		long ts = System.nanoTime();
		for (int i = 0; i< 10000000 ; i++) {
			isPalendrom3("asdfgqokjeklwqje");
		}
		System.out.println((System.nanoTime() - ts)/1000/1000d +"ms");
	}

	private static boolean isPalen(String str) {
		int len1 = str.length()/2;
		for (int i = 0; i< len1 ; i++) {
			int len2 =str.length() -1;
			if ( str.charAt(i) != str.charAt(len2 - i)) return false;		
		}
		return true;
	}
	
	private static boolean isPalendrom(long n, int r) {
		String str;
		str = Long.toString(n,r);		
		
	    return isPalen(str);
	}
	private static boolean isPalendrom2(String str) {

		char[] charArray = str.toCharArray();
		int len1 = charArray.length/2;
		
		for (int i = 0; i< len1 ; i++) {
			int len2 =charArray.length -1;
			if ( charArray[i] != charArray[len2 - i]) return false;		
		}
		return true;
	}
	private static boolean isPalendrom3(String str) {
		StringBuilder sb = new StringBuilder(str);
		 			return	sb.reverse().equals(str);
		
		
	}
	
	
	
	
	
}
