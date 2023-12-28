package day4;

import java.util.Scanner;

public class avgOfTenNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        int total = 0;
        for(int i = 1; i <= 10; i++){
            int num = sc.nextInt();
            total = total +  num;
        }

        double average = (double) total / 10;

        System.out.println("The average is: " + average);

    }
}
