import java.util.*;

public class JavaComparator {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Lokesh");
        names.add("Ram");
        names.add("Krishna");
        names.add("Sai");

        Collections.sort(names, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        });

        System.out.println("Sorted by length:");
        System.out.println(names);
    }
}