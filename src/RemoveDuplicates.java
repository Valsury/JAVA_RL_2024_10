import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a list to store the numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Prompt the user to enter 10 integers
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            numbers.add(number); // Add the number to the list
        }

        // Remove duplicates from the list
        removeDuplicate(numbers);

        // Display the unique numbers separated by a single space
        System.out.print("Unique integers are: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Method to remove duplicate elements from the list
    public static void removeDuplicate(ArrayList<Integer> list) {
        // Use a Set to track unique elements
        Set<Integer> uniqueSet = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Iterate through the list and add unique elements to the result
        for (Integer number : list) {
            if (uniqueSet.add(number)) { // If the element is unique, add it to the result
                result.add(number);
            }
        }

        // Clear the original list and add all unique elements back
        list.clear();
        list.addAll(result);
    }
}