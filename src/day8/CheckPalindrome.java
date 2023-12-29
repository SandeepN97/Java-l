package day8;

public class CheckPalindrome {
    public boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) reversed += str.charAt(i); // reversed = reversed + str.charAt(i);
        return reversed.equals(str);
    }
}
