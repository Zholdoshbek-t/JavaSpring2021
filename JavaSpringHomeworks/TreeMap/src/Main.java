import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<Fighter, String> mostWinFighters = new TreeMap<>();
        mostWinFighters.put(new Fighter("Jon Jones", 26), "USA");
        mostWinFighters.put(new Fighter("Kamaru Usman", 18), "USA");
        mostWinFighters.put(new Fighter("Khabib Nurmagomedov", 29), "Russia");
        mostWinFighters.put(new Fighter("Israel Adesanya", 20), "New Zealand");
        mostWinFighters.put(new Fighter("Valentina Shevchenko", 19), "Kyrgyzstan");
        mostWinFighters.put(new Fighter("Amanda Nunes", 21), "Brazilia");
        mostWinFighters.put(new Fighter("Jan Blachowicz", 28), "Poland");

        Set<Map.Entry<Fighter, String>> fighters = mostWinFighters.entrySet();
        for(Map.Entry<Fighter, String> fighter: fighters) {
            System.out.println("Country: " + fighter.getValue());
            System.out.println("Record: " + fighter.getKey());
            System.out.println("-----------------------");
        }

        System.out.println("The top three UFC fighter:");
        System.out.println(mostWinFighters.subMap(new Fighter("Khabib Nurmagomedov", 29), true,
                new Fighter("Jon Jones", 26), true));
    }
}
