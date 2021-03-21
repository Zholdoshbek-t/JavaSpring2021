import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(60);
        nums.add(60 * 60);
        nums.add(60 * 60 * 24);
        nums.add(60 * 60 * 24 * 7);
        nums.add(60 * 60 * 24 * 30);
        System.out.println("Index of 3600 seconds: " + binarySearch(nums, 3600));
        System.out.println("------------------------");
        Collections.reverse(nums);
        nums.forEach(System.out::println);
        System.out.println("------------------------");
        int min = Collections.min(nums);
        int max = Collections.max(nums);
        nums.set(nums.indexOf(min), max);
        nums.set(nums.indexOf(max), min);
        nums.forEach(System.out::println);
        System.out.println("------------------------");
        for(int i = 0; i < nums.size(); i++) {
            nums.set(i, 42);
        }
        nums.forEach(System.out::println);
    }

    public static int binarySearch(ArrayList<Integer> list, int findNum) {
        int left = 0;
        int right = list.size() - 1;
        while(left <= right) {
            int mid = left + ((right - left) / 2);
            if(list.get(mid) == findNum) {
                return mid;  // 1 2 3 4 5 6 7 8      (2)
            } else if(list.get(mid) > findNum) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
