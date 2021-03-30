import java.util.*;

public class Main {
    public static void main(String[] args) { // country -> cities(districts)
        City moscowDistricts = new City(1232L, "Moscow");
        moscowDistricts.addDistrict(new District(80081L, "Skolkovo"));
        moscowDistricts.addDistrict(new District(80021L, "Arbat"));
        moscowDistricts.addDistrict(new District(80031L, "Moscow City"));
        City piterDistricts = new City(1234L, "Piter");
        piterDistricts.addDistrict(new District(80081L, "Gronkovo"));
        piterDistricts.addDistrict(new District(82021L, "Hamaev district"));
        piterDistricts.addDistrict(new District(83031L, "Metropol district"));
        City bishkekDistricts = new City(80090L, "Bishkek");
        bishkekDistricts.addDistrict(new District(90081L, "Asanbay microdistrict"));
        bishkekDistricts.addDistrict(new District(90083L, "Kyzylasker"));
        bishkekDistricts.addDistrict(new District(90084L, "12th microdistrict"));
        City oshDistricts = new City(80091L, "Osh");
        oshDistricts.addDistrict(new District(29000L, "Aravan District"));
        oshDistricts.addDistrict(new District(29002L, "Kara-Suu District"));
        oshDistricts.addDistrict(new District(29001L, "Alay District"));
        TreeMap<Country, TreeSet<City>> countries = new TreeMap<>();
        TreeSet<City> kyrgyzstan = new TreeSet<>();
        kyrgyzstan.add(bishkekDistricts);
        kyrgyzstan.add(oshDistricts);
        TreeSet<City> russia = new TreeSet<>();
        russia.add(moscowDistricts);
        russia.add(piterDistricts);
        countries.put(new Country(12201L, "Kyrgyzstan"), kyrgyzstan);
        countries.put(new Country(12190L, "Russia"), russia);
        Set<Map.Entry<Country, TreeSet<City>>> set = countries.entrySet();
        for(Map.Entry<Country, TreeSet<City>> country: set) {
            System.out.println(country.getKey());
            System.out.println(country.getValue());
        }
    }
}
