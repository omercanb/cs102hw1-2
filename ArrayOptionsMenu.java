import java.util.Scanner;
import java.util.Arrays;

public class ArrayOptionsMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int value = 0;
        int [] integers = null;
        while (value != 5) {
            System.out.println("Please select an option:");
            System.out.println("1- Create an array that contains random integers between 0 and 100.");
            System.out.println("2- Find the min and max of the array.");
            System.out.println("3- Find the average of the array and display each element's difference from the average.");
            System.out.println("4- Find the sum of elements with odd and even numbered indexes.");
            System.out.println("5- Exit");
            value = input.nextInt();
            if (value == 1) {
                System.out.print("Enter array size: ");
                int size = input.nextInt();
                integers = ArrayUtilities.createRandomArray(size);
                System.out.println("Created the array: ");
            }
            else if (value == 2) {
               System.out.println("The max of the array is " + ArrayUtilities.max(integers));
               System.out.println("The min of the array is " + ArrayUtilities.min(integers));
            }
            else if (value == 3) {
                System.out.println("The average of the array is " + ArrayUtilities.findAverage(integers));
                System.out.println("The difference array is " + Arrays.toString(ArrayUtilities.findDiffer(integers)));
            }
            else if (value == 4) {
                System.out.println("The sum of elements with odd numbered indexes is " + ArrayUtilities.sumOfOdds(integers));
                System.out.println("The sum of elements with even numbered indexes is " + ArrayUtilities.sumOfEvens(integers));
            }
            else if (value == 5) {
                System.out.println("Goodbye!");
            }
            else {
                System.out.println("Invalid choice, try again.");
            }
            
            if (value != 5)
            {
                System.out.println("Array: " + Arrays.toString(integers));
            }
        }
        input.close();
    }
}
