import java.util.*;

public class array12 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 6, 7};

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println("First Non-Repeating Element = " + num);
                break;
            }
        }
    }
}
