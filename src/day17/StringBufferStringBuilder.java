package day17;

public class StringBufferStringBuilder {
    public static void main(String[] args){
        StringBuilder stringBuilder1 = new StringBuilder("Java");
        stringBuilder1.append(" is");
        stringBuilder1.append(" a");
        stringBuilder1.append(" programming");
        stringBuilder1.append(" language");
        System.out.println(stringBuilder1);

        StringBuilder stringBuilder2 = new StringBuilder("Java");
        stringBuilder2.append(" is").append(" a").append(" programming").append(" language");

        System.out.println(stringBuilder2);
        System.out.println("The equals method is: " + stringBuilder1.equals(stringBuilder2));

        String s1 = stringBuilder1.toString();
        System.out.println(s1);

        String s2 = stringBuilder2.toString();
        System.out.println(s2);

        System.out.println("The equals method is: " + s1.equals(s2));
    }
}
