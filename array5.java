import java.util.Scanner;
public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) { 
                secondSmallest = smallest;
                smallest = arr[i];
            } else if(arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second Smallest = " + secondSmallest);
        sc.close();
        
    }
    
}
