import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> autos = new Stack<>();
        autos.push("Mercedes");
        autos.push("BMW");
        autos.push("Lamborghini");
        autos.push("Ferrari");
        String lastElement = autos.pop();
        System.out.println("Removed element was - " + lastElement);
        int firstElement = autos.search("Mercedes");
        System.out.println("Index of the first element from the top: " + firstElement);
    }
}
