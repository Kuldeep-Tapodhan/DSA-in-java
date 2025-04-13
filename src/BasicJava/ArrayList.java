import java.util.ArrayList;

 class ArrayListInt {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Print the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Access an element by index
        int firstElement = numbers.get(0);
        System.out.println("First element: " + firstElement);

        // Iterate through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Remove an element (by value)
        numbers.remove(Integer.valueOf(20)); //Important to use Integer.valueOf() to remove by value.
        System.out.println("ArrayList after removing 20: " + numbers);

        // Check if an element exists
        boolean contains30 = numbers.contains(30);
        System.out.println("Contains 30: " + contains30);

        // Get the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);

        //Clear the arraylist
        numbers.clear();
        System.out.println("ArrayList after clear: " + numbers);

        //check if arraylist is empty.
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is arraylist empty: " + isEmpty);

        //re add some elements.
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        //Replace an element at a specific index.
        numbers.set(1, 250);
        System.out.println("ArrayList after set: " + numbers);

        //Demonstrate adding elements at a specific index.
        numbers.add(0, 50); //Add 50 at index 0.
        System.out.println("ArrayList after adding 50 at index 0: " + numbers);

        //Demonstrate removing an element at a specific index.
        numbers.remove(2); //Remove the element at index 2
        System.out.println("ArrayList after removing element at index 2: " + numbers);

    }
}