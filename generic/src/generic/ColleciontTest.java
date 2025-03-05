package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ColleciontTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2
		String[] colorStrings = {
				"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"
		};
		List<String> list = new ArrayList<String>();
		for (String string : colorStrings) {
			list.add(string);
		}
		String[] removeStrings = {
				"RED", "WHITE", "BLUE"
		};
		List<String> removeList = new ArrayList<String>();
		for (String string2 : removeStrings) {
			removeList.add(string2);
		}
//		System.out.println("Arraylist: ");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.printf("%s ", list.get(i));
//		}
//		removeColors(list, removeList);
//		System.out.println("\n\narraylist after calling removecolors");
//		for (String string : list) {
//			System.out.printf("%s ", string);
//		}
		
		//3
		String[] colorStrings2 =  {"black","yellow", "green", "blue","violet", "silver" };
		List<String> list2 = new LinkedList<String>();
		for (String string : colorStrings) {
			list2.add(string);
		}
		String[] colorStrings3 = {"gold","white","brown","blue","gray", "silver" };
		List<String> list3 = new LinkedList<String>();
		for (String string : colorStrings3) {
			list3.add(string);
		}
		list2.addAll(list3);
		list3 = null;
		convertToUpperList(list2);
//		printList(list2);
//		convertToUpperList(list2);
//		printList(list2);
//		System.out.println("\ndeleing element 4 to 6...");
//		removeItems(list2, 4, 7);
//		printList(list2);
//		printReversed(list2);
		
		//11
		Character[] letterCharacters = {'P', 'C', 'M'};
		List<Character> list4 = Arrays.asList(letterCharacters);
		System.out.println("list collection");
		output(list4);
		Collections.reverse(list4);
		output(list4);
		Character[] lettercopyCharacters = new Character[3];
		List<Character> list5 = Arrays.asList(lettercopyCharacters);
		Collections.copy(list5, list4);
		System.out.println("\nafter copying ,");
		output(list5);
		Collections.fill(list4, 'R');
		System.out.println("after falling with r");
		output(list4);
	}
	
	//11
	private static void output(List<Character> list) {
		System.out.println("the list is: ");
		for (Character character : list) {
			
			System.out.printf("%s ", character);
		}
		System.out.printf("\nmax: %s", Collections.max(list));
		System.out.printf("\nmin: %s", Collections.min(list));
	}
	
	//3
	private static void printReversed(List<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());
		System.out.println("\nreversed list: ");
		while (iterator.hasPrevious()) {
			System.out.printf("%s ", iterator.previous());
		}
	}
	private static void removeItems(List<String> list, int start, int end) {
		list.subList(end, end).clear();
	}
	private static void printList(List<String> list) {
		System.out.println("\nlist: ");
		for (String string : list) {
			System.out.printf("%s ",string);
		}
		System.out.println();
	}
	private static void convertToUpperList(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			String colorString = iterator.next();
			iterator.set(colorString.toUpperCase());
		}
	}

	//2
	private static void removeColors(Collection<String> one, Collection<String> two) {
		Iterator<String> iterator = one.iterator();
		while (iterator.hasNext()) {
			if (two.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}
}
