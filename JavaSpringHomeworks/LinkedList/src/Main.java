import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Harry Potter");
        books.add("The book thief");
        books.add("Shantaram");
        books.add("Gonchie Lilit");
        books.add("Arthur, Lui and Adel");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(books);
        linkedList.addFirst("Son");
        linkedList.push("Son");
        linkedList.addLast("Good to great");
        linkedList.addLast("Good to great");
        linkedList.removeFirstOccurrence("Son");
        linkedList.removeLastOccurrence("Good to great");
        linkedList.forEach(System.out::println);
    }
}
