package twentyPointTwo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colorStrings = {
			"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"	
		};
		List<String> list = new ArrayList<String>();
		for (String string : colorStrings) {
			list.add(string);
		}
		
		String[] removeStrings = {"RED", "WHITE", "BLUE"};
		List<String> removList = new ArrayList<String>();
		for (String string : removeStrings) {
			removList.add(string);
		}
		System.out.println("ArrayList");
		for (int i = 0; i < list.size()	; i++) {
			System.out.printf("%s ", list.get(i));
		}
		
		removeColors(list, removList);
		System.out.println("\n\nArrayList after calling removeColors:");
		for (String colorString : list) {
			System.out.printf("%s ", colorString);
		}
	}
	private	static void removeColors(Collection<String> one, Collection<String>two) {
		Iterator<String> iterator = one.iterator()	;
		while (iterator.hasNext()) {
			if (two.contains(iterator.next())) {
				iterator.remove();
			}
		}
		
	}

}
