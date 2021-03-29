import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Student> SAT_SCORE_COMPARATOR = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getSAT_SCORE() > o2.getSAT_SCORE()) {
                    return -1;
                } else if(o1.getSAT_SCORE() < o2.getSAT_SCORE()) {
                    return 1;
                }
                return 0;
            }
        };

        Student Bika = new Student("Nazbiyke", 220275601, 1590);
        Student Salih = new Student("Salih", 220275602, 1530);
        Student Maksat = new Student("Maksat", 220275603, 1480);
        Student Yryskeldi = new Student("Yryskeldi", 220275604, 1510);
        Student Adel = new Student("Adel", 220275605, 1500);
        Student Emirlan = new Student("Emirlan", 220275606, 1570);

        TreeSet<Student> topScores = new TreeSet<Student>(SAT_SCORE_COMPARATOR);
        topScores.add(Bika);
        topScores.add(Salih);
        topScores.add(Maksat);
        topScores.add(Yryskeldi);
        topScores.add(Adel);
        topScores.add(Emirlan);

        System.out.println("Top SAT results:");
        for(Student student: topScores) {
            System.out.println(student);
        }
    }
}
