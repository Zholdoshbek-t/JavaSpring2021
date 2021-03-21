import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Harry Potter");
        books.add("The book thief");
        books.add("Shantaram");
        books.add("Gonchie Lilit");
        books.add("Arthur, Lui and Adel");
        books.forEach(System.out::println);

        books.remove(books.size()-1);
        books.forEach(System.out::println);

        books.set(books.size()-1, "Arthur, Lui and Adel");
        System.out.println(books.get(books.size()-1));

        books.clear();
        books.add("Wild Game: My Mother, Her Secret, and Me");
        books.add("Sword of Destiny");
        books.add("Blood of Elves");
    }
}
