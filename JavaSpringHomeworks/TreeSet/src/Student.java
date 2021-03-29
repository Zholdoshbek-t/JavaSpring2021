public class Student {
    private String name;
    private Long ID;
    private int SAT_SCORE;

    public Student(String name, long ID, int SAT_SCORE) {
        this.name = name;
        this.ID = ID;
        this.SAT_SCORE = SAT_SCORE;
    }

    public int getSAT_SCORE() {
        return SAT_SCORE;
    }

    public void setSAT_SCORE(int SAT_SCORE) {
        this.SAT_SCORE = SAT_SCORE;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", SAT_SCORE=" + SAT_SCORE +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
}
