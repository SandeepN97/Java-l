package assignment;

public class ArrayArrayMain {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }

        System.out.println("Elements of original array: ");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\nElements of new array: ");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

        int[] arr = {1, 2, 3, 4};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println("Sum of array elements: " + sum);

        // Method to calculate average of array elements
        int sum1 = 0;
        for(int i = 0; i < arr.length; i++){
            sum1 += arr[i];
        }

        System.out.println("Average of array elements: " + (double) sum1 / arr.length);
    }
}
