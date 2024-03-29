import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> namesList = new ArrayList<>();

        // Add elements to the ArrayList
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        namesList.add("David");

        // Display the ArrayList
        System.out.println("Names List: " + namesList);

        // Access elements by index
        System.out.println("Element at index 2: " + namesList.get(2));

        // Modify an element
        namesList.set(1, "Eve");
        System.out.println("Modified Names List: " + namesList);

        // Remove an element by value
        namesList.remove("Charlie");
        System.out.println("Names List after removal: " + namesList);

        // Check if an element exists
        System.out.println("Contains 'David'? " + namesList.contains("David"));

        // Get the size of the ArrayList
        System.out.println("Size of Names List: " + namesList.size());

        // Iterate over the ArrayList
        System.out.println("Elements:");
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}
