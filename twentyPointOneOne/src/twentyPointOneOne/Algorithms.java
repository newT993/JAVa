package twentyPointOneOne;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	private static void output(List<Character> listref) {
		System.out.println("the list is: ");
		
		for (Character character : listref) {
			System.out.printf("%s ", character);
		}
		
		System.out.printf("\nMax: %s", Collections.max(listref));
		System.out.printf(" Min: %s\n", Collections.min(listref));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Character[] lettersCharacters = {'P', 'C', 'M'};
		List<Character> list = Arrays.asList(lettersCharacters);
		System.out.println("list contains");
		output(list);
		
		Collections.reverse(list);
		System.out.println("\nafter calling reverse, list contains");
		output(list);
		
		Character[] letterCopyCharacters = new Character[3];
		List<Character> copyList = Arrays.asList(letterCopyCharacters);
		
		Collections.copy(copyList, list);
		System.out.println("\nAfrer copying.Copylist conains");
		output(copyList);
		
		Collections.fill(list, 'R');
		System.out.println("\nafter calling fill, list contains: ");
		output(list);
	}

}
