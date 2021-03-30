public class District implements Comparable{
    private Long ID;
    private String district_name;

    public District(Long ID, String district_name) {
        this.ID = ID;
        this.district_name = district_name;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    @Override
    public String toString() {
        return "District{" +
                "ID=" + ID +
                ", district_name='" + district_name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        District district = (District) o;
        return district_name.compareTo(district.getDistrict_name());
    }
}
