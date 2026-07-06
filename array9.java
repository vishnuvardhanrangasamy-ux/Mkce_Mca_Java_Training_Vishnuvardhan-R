import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 6; 
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < n - 1; i++) {
            actualSum += arr[i];
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Number = " + missing);
    }
}