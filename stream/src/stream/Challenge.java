package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge {
	
	public static String getString(List<Integer> list) {
		return list.stream().map(x -> {
			String s = "";
			if(x % 2 == 0) {
				s = "e" + x;
			}else {
				s = "o" + x;
				}
			return s;
		})
				.collect(Collectors.joining(","));
		
	}

	public static void main(String[] args) {
        System.out.println(getString(Arrays.asList(3,44))); //isEqualTo("o3,e44");
       // System.out.println(getString(singletonList(3))); //isEqualTo("o3");

	}

}
