package day16;

public class StringDemo {
    public static void main(String[] args){
        // Initialization of strings
        String str1 = "soojan";
        String str2 = "soojan";
        String str3 = "prabhat";
        String str4 = "abcdef";
        String str5 = new String("soojan");

        // Comparisons using == operator
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 == str5: " + (str1 == str5));

        // Comparisons using equals() method
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str5): " + str1.equals(str5));

        // Comparisons using compareTo() method
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4));
        System.out.println("str4.compareTo(str1): " + str4.compareTo(str1));
        System.out.println("str1.compareTo(str5): " + str1.compareTo(str5));

        // Case-insensitive comparisons
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));
        System.out.println("str1.equalsIgnoreCase(str5): " + str1.equalsIgnoreCase(str5));

        // Other string methods
        System.out.println("str1.contains(\"oo\"): " + str1.contains("oo"));
        System.out.println("str1.contains(\"OO\"): " + str1.contains("OO"));
        System.out.println("str1.endsWith(\"jan\"): " + str1.endsWith("jan"));
        System.out.println("str1.endsWith(\"JAN\"): " + str1.endsWith("JAN"));
        System.out.println("str1.startsWith(\"soo\"): " + str1.startsWith("soo"));
        System.out.println("str1.startsWith(\"SOO\"): " + str1.startsWith("SOO"));
        System.out.println("str1.indexOf(\"oo\"): " + str1.indexOf("oo"));
        System.out.println("str1.indexOf(\"oo\", 2): " + str1.indexOf("oo", 2));
        System.out.println("str1.charAt(2): " + str1.charAt(2));
        System.out.println("str1.substring(2, 5): " + str1.substring(2, 5));
        System.out.println("str1.substring(2): " + str1.substring(2));
        System.out.println("str1.toLowerCase(): " + str1.toLowerCase());
        System.out.println("str1.toUpperCase(): " + str1.toUpperCase());
        System.out.println("str1.trim(): " + str1.trim());
        System.out.println("str1.replace('o', 'a'): " + str1.replace('o', 'a'));
        System.out.println("str1.replace(\"oo\", \"aa\"): " + str1.replace("oo", "aa"));
        System.out.println("str1.charAt(2): " + str1.charAt(2));
        System.out.println("str1.length(): " + str1.length());
        System.out.println("str1.concat(str3): " + str1.concat(str3));
        System.out.println("str1.concat(str4): " + str1.concat(str4));
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str5: " + (str1 == str5));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str5): " + str1.equals(str5));
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));

        //calling Student class
        Student student = new Student();
        Student student1 = new Student();
        student.name = "soojan";
        student1.name = "Sandeep";
        System.out.println(student.name.equals(student1.name));

    }
}
