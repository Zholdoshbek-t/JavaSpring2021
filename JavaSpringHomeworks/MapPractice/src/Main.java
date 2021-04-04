import java.util.*;

public class Main {
    public static void main(String[] args) { // HashMap and LinkedHashMap (buckets) , merge method
        HashMap<String, Laptop> laptopHashMap = new HashMap<>();
        laptopHashMap.put("Tika", new Laptop("Acer", 10023L));
        laptopHashMap.put("Dosya", new Laptop("HP", 10022L));
        laptopHashMap.put("Fara", new Laptop("Apple", 10025L));
        laptopHashMap.put("Adik", new Laptop("Asus", 10024L));
        laptopHashMap.put("Bika", new Laptop("Lenovo", 10021L));
        laptopHashMap.put("Bika", new Laptop("Apple", 10021L));
        laptopHashMap.put("Bika", new Laptop("Xiaomi", 10021L)); // This one is current
//        System.out.println(laptopHashMap);
//        System.out.println(set);
        Set<String> keys = laptopHashMap.keySet();
        Collection<Laptop> values = laptopHashMap.values();
        //laptopHashMap.forEach((k, v) -> System.out.println(k + " = " + v));
        //System.out.println(laptopHashMap.getOrDefault("Nazbiyke", new Laptop("Dell", 10026L)));

        Set<Map.Entry<String, Laptop>> set = laptopHashMap.entrySet();
//        for(Map.Entry<String, Laptop> map: set) {
//            System.out.println(map.getKey());
//            System.out.println(map.getValue());
//        }

        laptopHashMap.replace("Adik", new Laptop("Mackbook Air", 10026L));
        //System.out.println(laptopHashMap);

        LinkedHashMap<String, Laptop> linkedHashMap = new LinkedHashMap<String, Laptop>(16, 0.75f, true);
        linkedHashMap.put("Tika", new Laptop("Acer", 10023L));
        linkedHashMap.put("Bika", new Laptop("Apple", 10021L));
        linkedHashMap.put("Fara", new Laptop("Lenovo", 10025L));
        linkedHashMap.put("Dosya", new Laptop("HP", 10022L));
        linkedHashMap.put("Adik", new Laptop("Asus", 10024L));
//        System.out.println(linkedHashMap);
//        linkedHashMap.get("Fara"); // Fara key-value moves to the end
//        System.out.println(linkedHashMap);

        TreeMap<String, Laptop> treeMap = new TreeMap<>();
        treeMap.put("Tika", new Laptop("Acer", 10023L));
        treeMap.put("Bika", new Laptop("Apple", 10021L));
        treeMap.put("Fara", new Laptop("Lenovo", 10025L));
        treeMap.put("Dosya", new Laptop("HP", 10022L));
        treeMap.put("Adik", new Laptop("Asus", 10024L));
//        System.out.println(treeMap);

    }
}
