import java.util.*;

public class array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        int n = list.size();
        int firstRepeating = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list.get(i).equals(list.get(j))) {
                    firstRepeating = list.get(i);
                    System.out.println("First Repeating Element = " + firstRepeating);
                    return;
                }
            }
        }

        System.out.println("No Repeating Element");
    }
}
