package day8;

public class SecondLargestNumber {
    public int secondLargestNumber(int[] arr) {
        // Initialize variables to store the maximum and second maximum values.
        int max = arr[0];
        int secondMax = arr[0];

        //example of the array [1, 2, 3, 4, 5]
        //max = 1
        //secondMax = 1
        //i = 1
        //arr[i] = 2
        //2 > 1
        //max = 2
        //secondMax = 1
        //i = 2
        //arr[i] = 3
        //3 > 2
        //max = 3
        //secondMax = 2
        //i = 3
        //arr[i] = 4
        //4 > 3
        //max = 4
        //secondMax = 3
        //i = 4
        //arr[i] = 5
        //5 > 4
        //max = 5
        //secondMax = 4

        // Iterate through the array starting from the second element (index 1).
        for (int i = 1; i < arr.length; i++) {
            // Check if the current element is greater than the current maximum.
            if (arr[i] > max) {
                // If true, update both the maximum and second maximum values.
                secondMax = max;
                max = arr[i];
            }
            // If the current element is not greater than the maximum,
            // but it is greater than the second maximum and not equal to the maximum,
            // update the second maximum value.
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        // Return the second maximum value after iterating through the entire array.
        return secondMax;
    }
}
