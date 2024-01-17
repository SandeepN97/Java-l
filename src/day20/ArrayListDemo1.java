package day20;


import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args){
        //create an array list
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Printing the list");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println("Printing the list using advanced for loop");
        for(int element : list) System.out.println(element);
        System.out.println("Printing the list using while loop");
        while(list.size() > 0){
            System.out.println(list.remove(0));
        }
    }
}
