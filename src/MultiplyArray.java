// Problem: Multiply Each Array Element by 10
// Pattern: Array Traversal
// Time Complexity: O(n)
// Space Complexity: O(n)

public class MultiplyArray {

    static int[] multiplyBy10(int[] arr) {

        int size = arr.length;

        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {

            int element = arr[i];

            int newElement = element * 10;

            newArray[i] = newElement;
        }

        // Return updated array
        return newArray;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] ans = multiplyBy10(arr);

        System.out.println("Multiply By 10");

        System.out.println("Printing ans array:");

        for (int i : ans) {
            System.out.println(i);
        }
    }
}