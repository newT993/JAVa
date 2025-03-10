package labTwo;
import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        // Add colors elements to list1
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();

        for (String color : colors)
            list1.add(color);

        // Add colors2 elements to list2
        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();

        for (String color : colors2)
            list2.add(color);

        // Concatenate lists
        list1.addAll(list2);
        list2 = null; // Release resources

        printList(list1); // Print list1 elements

        // Sort the list
        Collections.sort(list1);
        printList(list1);

        // Search for "silver"
        printSearchResults(list1, "silver");

        // Remove elements 3 to 7
        System.out.print("\nDeleting elements 3 to 7...");
        removeItems(list1, 3, 8);
        printList(list1);

        // Frequency of "blue" in the list
        int frequency = Collections.frequency(list1, "blue");
        System.out.printf("\nFrequency of 'blue' in list1: %d\n", frequency);

        // Convert elements to uppercase
        convertToUppercaseStrings(list1);
        printList(list1);
    }

    // Output List contents
    private static void printList(List<String> list) {
        System.out.println("\nList: ");
        for (String color : list) 
            System.out.printf("%s ", color);
        System.out.println();
    }

    // Locate String objects and convert to uppercase
    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next(); // Get item
            iterator.set(color.toUpperCase()); // Convert to uppercase
        }
    }

    // Obtain sublist and use clear method to delete sublist items
    private static void removeItems(List<String> list, int start, int end) {
        if (start >= 0 && end <= list.size()) {
            System.out.println("\nTesting....... " + list.subList(start, end));
            list.subList(start, end).clear(); // Remove items
        } else {
            System.out.println("\nInvalid range for removal.");
        }
    }

    // Search for a specific string in the list
    private static void printSearchResults(List<String> list, String key) {
        System.out.printf("\nSearching for: %s\n", key);
        int result = Collections.binarySearch(list, key);
        if (result >= 0)
            System.out.printf("Found at index %d\n", result);
        else
            System.out.printf("Not Found (%d)\n", result);
    }
}
