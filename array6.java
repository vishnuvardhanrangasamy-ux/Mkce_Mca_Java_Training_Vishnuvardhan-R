import java.util.Scanner;
public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i < 8; i++) {
             if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < 8) {
            arr[index] = 0;
            index++;
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
            sc.close();
        }
    }
}
        
