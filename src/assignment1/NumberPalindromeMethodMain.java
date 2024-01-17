package assignment1;

import java.util.Scanner;

public class NumberPalindromeMethodMain {
    public static void main(String[] args) {
        NumberPalindromeMethod numberPalindromeMethod = new NumberPalindromeMethod();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Is " + number + " a palindrome? " + numberPalindromeMethod.isPalindrome(number));
    }
}
