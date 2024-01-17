package assignment1;

public class NumberPalindromeMethod {
    public boolean isPalindrome(int number){
        int reversed = 0;
        int original = number;
        while(number != 0){
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        return reversed == original;
    }
}
