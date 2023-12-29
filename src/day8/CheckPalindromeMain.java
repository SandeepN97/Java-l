package day8;

import java.util.Scanner;

public class CheckPalindromeMain {
    public static void main(String[] args) {
        //ask user for a string and check if it is a palindrome
        CheckPalindrome cp = new CheckPalindrome();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        boolean palindrome = cp.isPalindrome(str);
        System.out.println("Is " + str + " a palindrome? " + palindrome);
    }
}
