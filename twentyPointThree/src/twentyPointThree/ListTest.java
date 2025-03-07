package twentyPointThree;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
	private static void printReversedList(List<String>list) {
		ListIterator<String> iterator = list.listIterator(list.size())	;
		System.out.println("\nReversed list: ");
		while (iterator.hasPrevious()) {
			System.out.printf("%s ", iterator.previous());
		}
	}
	private static void removeItem(List<String> list, int start, int end) {
		list.subList(start, end).clear();
	}
	private static void convertToUpperCase(List<String>list) {
		ListIterator<String> iterator = list.listIterator()	;
		while (iterator.hasNext()) {
			String colorString = iterator.next()	;
			iterator.set(colorString.toUpperCase());
		}
	}
	private static void printList(List<String>list) {
		System.out.println("\nlist: ");
		for (String colorString : list) {
			System.out.printf("%s ", colorString);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colorStrings = {
				"black", "yellow", "green", "blue", "violet", "silver"
		};
		List<String> listoneList = new LinkedList<String>();
		for (String color : colorStrings) {
			listoneList.add(color);
		}
		
		String[] colorTwoStrings = {
				"gold", "white", "brown", "blue", "gray", "silver"
		};
		List<String> listTwoList = new LinkedList<String>();
		for (String color : colorTwoStrings) {
			listoneList.add(color);
		}
		
		listoneList.addAll(listTwoList);
		listTwoList = null;
		printList(listoneList);
		
		convertToUpperCase(listoneList);
		printList(listoneList);
		
		System.out.println("\nDeleting elements 4 to 6...");
		removeItem(listoneList, 4, 7);
		printList(listoneList);
		printReversedList(listoneList);
	}

}
