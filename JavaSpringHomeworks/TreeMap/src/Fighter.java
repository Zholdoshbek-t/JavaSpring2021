public class Fighter implements Comparable {

    private String name;
    private int wins;

    public Fighter(String name, int wins) {
        this.name = name;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", wins=" + wins +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Fighter fighter = (Fighter) o;
        if(this.wins > fighter.getWins()) {
            return -1;
        } else if(this.wins < fighter.getWins()) {
            return 1;
        }
        return 0;
    }
}
