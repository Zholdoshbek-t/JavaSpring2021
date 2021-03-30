public class Country implements Comparable{
    private Long ID;
    private String country_name;

    public Country(Long ID, String country_name) {
        this.ID = ID;
        this.country_name = country_name;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "ID=" + ID +
                ", country_name='" + country_name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Country country = (Country) o;
        return country_name.compareTo(country.getCountry_name());
    }
}
