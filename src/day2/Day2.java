package day2;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        int  what = length * breadth;

        System.out.println(what);
    }
}
