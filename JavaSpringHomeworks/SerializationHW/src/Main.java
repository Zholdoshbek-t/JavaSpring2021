import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student tom = new Student("Tom", 17, 10, "Male");
        File file = new File("Example.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(tom);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student duplicateTom = (Student) ois.readObject();

        System.out.print("Duplicate of Tom:");
        System.out.println(duplicateTom);
    }
}
