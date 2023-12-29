package day8;

import java.util.Scanner;

public class CheckVowelMain {
    public static void main(String[] args) {
        //ask user for a string and check if it contains a vowel
        CheckVowel cv = new CheckVowel();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Does " + str + " contain a vowel? " + cv.isVowel(str));
        sc.close();
    }
}
