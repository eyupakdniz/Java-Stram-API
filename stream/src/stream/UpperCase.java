package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;


public class UpperCase {
	
	public static Collection<String> mapToUppercase(String... names) {
		Collection<String> uppercaseNames = new ArrayList<>();
		for(String name : names) {
			uppercaseNames.add(name.toUpperCase());
		}
		return uppercaseNames;
	}

	
	public static Collection<String> mapToUppercase2(String... names) {
		return Arrays.asList(names).stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		  
	}
	
	
	public static void main(String[] args) {
		  //mapToUppercase2("A", "b", "c");
		  System.out.print(mapToUppercase2("A", "b", "c"));
	}

}
