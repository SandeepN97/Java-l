package day7;

public class CowCalling {
    public static void main(String[] args){
        //creating object of Cow class
        Cow cow = new Cow();
        //calling attributes of Cow class
        System.out.println(cow.name);
        System.out.println(cow.breed);
        System.out.println(cow.age);
        System.out.println(cow.milkProduction);
        //calling methods of Cow class
        cow.moo();
        cow.eat();
        cow.sleep();
        cow.produceMilk();

    }
}
