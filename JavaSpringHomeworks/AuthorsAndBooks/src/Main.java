import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeMap<Author, Set<Book>> authorWikipedia = new TreeMap<>();
        Set<Book> khaledHosseini = new TreeSet<>();
        khaledHosseini.add(new Book(10020L, "The Kite Runner"));
        khaledHosseini.add(new Book(10028L, "A Thousand Splendid Suns"));
        khaledHosseini.add(new Book(10023L, "And The Mountains Echoed"));

        Set<Book> sergeyYesenin = new TreeSet<>();
        sergeyYesenin.add(new Book(18401L, "Anna Snegina"));
        sergeyYesenin.add(new Book(18421L, "Pugachev"));
        sergeyYesenin.add(new Book(18404L, "Radunitsa"));

        Set<Book> annaAkhmatova = new TreeSet<>();
        annaAkhmatova.add(new Book(29004L, "Requiem"));
        annaAkhmatova.add(new Book(29012L, "Belaya Staya"));
        annaAkhmatova.add(new Book(29034L, "Evening"));

        authorWikipedia.put(new Author(12259004L, "Khaled Hosseini"), khaledHosseini);
        authorWikipedia.put(new Author(12258010L, "Sergey Yesenin"), sergeyYesenin);
        authorWikipedia.put(new Author(12258022L, "Anna Akhmatova"), annaAkhmatova);

        Set<Map.Entry<Author, Set<Book>>> set = authorWikipedia.entrySet();
        for(Map.Entry<Author, Set<Book>> aboutAuthor: set) {
            System.out.println(aboutAuthor.getKey());
            System.out.println(aboutAuthor.getValue());
            System.out.println();
        }
    }
}
