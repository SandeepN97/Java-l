package assignment;

public class ArrayAverage {
    // Method to calculate average of array elements
    public  double average(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return (double) sum / arr.length;
    }

}
