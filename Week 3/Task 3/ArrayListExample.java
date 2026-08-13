import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("ArrayList: " + fruits);

        fruits.remove("Banana");

        System.out.println("After removal: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Size: " + fruits.size());
    }
}