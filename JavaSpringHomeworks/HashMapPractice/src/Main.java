import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> books = new HashMap<>();
        books.put(1, "Tilek");
        books.put(3, "Samat");
        books.put(2, "Bika");
        books.put(5, "Dastan");
        books.put(4, "Azamat");
        Set<Map.Entry<Integer, String>> entrySet = books.entrySet();
        for(Map.Entry<Integer, String> entry: entrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            entry.setValue("Nazbiyke");
        }
//        System.out.println(books);
        books.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
