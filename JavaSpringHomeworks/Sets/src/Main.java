import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Dastan", "Bika", "Samat", "Adilet", "Ulanbek", "Bakyt"};
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(names));
        System.out.println("HashSet order:");
        for(String s: hashSet) {
            System.out.println(s);
        }
        System.out.println("-------------");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(names));
        System.out.println("LinkedHashSet order:");
        for(String s: linkedHashSet) {
            System.out.println(s);
        }
    }
}
