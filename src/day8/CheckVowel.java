package day8;

public class CheckVowel {
    public boolean isVowel(String str){
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i) + "")) return true;
        }
        return false;
    }
}
