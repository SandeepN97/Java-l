package assignment1;

public class CopyArrayMethod {
    public int copyArray(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }

        return arr2.length;
    }
}
