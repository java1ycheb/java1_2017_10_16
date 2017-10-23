package ru.spec.java1.lec6;

import java.security.KeyStore.SecretKeyEntry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		map.put("hello", "world");
		map.put("heo", "wld");
		map.put("he", "word");
		map.put("hlo", "rld");
		map.put("helo", "wd");
		System.out.println(map);
		
		
		Set<Entry<String, String>> entrySet  = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println();
		}
		Set<String> keySet= map.keySet();
		Collection<String> values = map.values();
		
		map.forEach((key,val) -> System.out.println(key +" -> "+ val));
		//BiConsumer<String, String> consumer = new BiConsumer<String, String>() {

		//	@Override
		//	public void accept(String t, String u) {			
		//	}
		//};

	}
	

}
