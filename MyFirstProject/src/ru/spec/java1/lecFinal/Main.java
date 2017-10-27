package ru.spec.java1.lecFinal;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args)  {
		Number[] array = {1,2,3,4,5,6,7,8,9};
		List<Number> list = Arrays.asList(array);
		Stream<Number> stream = list.stream();
		//stream.filter(i->i%2==0).forEach(i->System.out.println(i));
	//	Number result = (Number) stream.
	//			map(i->i/2);
	//			.anyMatch(predicate)
	//			.allMatch()
	//          .flatMap()
			//	.reduce((i,j)->i+j)
			//	.orElse(0);
	//			.collect(Collectors.toList());
	//	System.out.println(result);
		Page<Number> page = new Page<>();
		page.setList(list);
	//	page.list.get
	}
	
	

		
}
