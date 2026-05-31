// Problem: Average of Elements in an Array
// Pattern: Array Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class AverageOfArray {

    static double getAverage(int[] arr) {

        double sum = 0;

        // Add all elements
        for (int i : arr) {
            sum += i;
        }

        int size = arr.length;

        double avg = sum / size;

        return avg;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 5};

        System.out.println("Average of Array");

        System.out.println(getAverage(arr));
    }
}
