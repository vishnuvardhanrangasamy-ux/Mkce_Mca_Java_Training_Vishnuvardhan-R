import java.util.Scanner;

public class array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 7;
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int unique = 0;
        for (int i = 0; i < n; i++) {
            unique ^= arr[i];
        }

        System.out.println("Unique Element = " + unique);
    }
}
