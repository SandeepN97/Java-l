package day7;

public class Pattern {
  //creating a method to print 2 separate patterns

    //how does pattern work?
    //first pattern
    //*
    //**
    //***
    //****

    //second pattern
    //****
    //***
    //**
    //*
public void printPattern(){
    //creating a for loop to print the first pattern
    //outer loop is for rows
    for(int i=1; i<=5; i++){
        //inner loop is for columns
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    //creating a for loop to print the second pattern
    for(int i=5; i>=1; i--){
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
