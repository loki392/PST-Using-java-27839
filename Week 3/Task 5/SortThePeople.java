import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

public class SortThePeople {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Lokesh", 21));
        people.add(new Person("Rahul", 19));
        people.add(new Person("Arun", 23));
        people.add(new Person("Sai", 20));

        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.age - p2.age;
            }
        });

        System.out.println("People sorted by age:");

        for (Person p : people) {
            System.out.println(p);
        }
    }
}