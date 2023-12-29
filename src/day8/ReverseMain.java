package day8;

import java.util.Scanner;

public class ReverseMain {
    public static void main(String[] args) {
        //ask user for a string and reverse it
        ReverseString rs = new ReverseString();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Reversed string: " + rs.reverseString(str));
        scanner.close();
    }
}
