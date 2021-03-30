import java.util.ArrayList;
import java.util.TreeSet;

public class City implements Comparable{
    private Long ID;
    private String city_name;
    private TreeSet<District> districts;

    public City(Long ID, String city_name) {
        this.ID = ID;
        this.city_name = city_name;
        districts = new TreeSet<>();
    }

    public void addDistrict(District d) {
        districts.add(d);
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    @Override
    public String toString() {
        ArrayList<District> arr = new ArrayList<>(districts);
        String result = "City{" +
                "ID=" + ID +
                ", city_name='" + city_name + '\'' +
                '}' + "\n";
        for(int i = 0; i < arr.size(); i++) {
            result += arr.get(i) + "\n";
        }
        return result;
    }

    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city_name.compareTo(city.getCity_name());
    }
}
