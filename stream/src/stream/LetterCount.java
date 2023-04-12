package stream;

import java.util.Arrays;

public class LetterCount {

	
	public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
		return 0;
	}
	
	public static int getTotalNumberOfLettersOfNamesLongerThanFive2(String... names) {
		return Arrays.asList(names).stream().filter(name -> name.length() > 5).mapToInt(name -> name.length()).sum();
		 
	}
	
	public static void main(String[] args) {
		System.out.print(getTotalNumberOfLettersOfNamesLongerThanFive2("Aaaaaa", "b", "c"));

	}

}
