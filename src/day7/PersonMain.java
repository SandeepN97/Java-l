package day7;

import static java.lang.System.*;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        out.println(person.name);
        out.println(person.age);
        out.println(person.gender);
        out.println(person.height);
        out.println(person.weight);
        person.eat();
        person.sleep();
        person.talk();
        person.walk();
        person.run();
    }
}
