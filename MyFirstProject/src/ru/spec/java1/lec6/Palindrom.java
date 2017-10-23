package ru.spec.java1.lec6;

public class Palindrom {

	public static void main(String[] args) {
		for (int i = 0; i< 100000 ; i++) {
			if (isPalendrom2(i,7) && isPalendrom2(i,17) ) {
				System.out.println("("
						+ i
						+ ") "
						+Long.toString(i,7)
						+" "
						+Long.toString(i,17));
			}
		}
	}

	private static boolean isPalendrom(String str) {
		int len1 = str.length()/2;
		for (int i = 0; i< len1 ; i++) {
			int len2 =str.length() -1;
			if ( str.charAt(i) != str.charAt(len2 - i)) return false;		
		}
		return true;
	}
	
	private static boolean isPalendrom2(long n, int r) {
		String str;
		str = Long.toString(n,r);		
		
	    return isPalendrom(str);
	}
	
	
	
	
	
	
}
