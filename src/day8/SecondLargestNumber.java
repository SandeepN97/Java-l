package day8;

public class SecondLargestNumber {
    public int secondLargestNumber(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
