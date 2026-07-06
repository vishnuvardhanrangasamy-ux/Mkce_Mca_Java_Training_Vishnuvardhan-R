import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();
    int original = n;
    int power = String.valueOf(n).length();
    int sum = 0;

    while (n > 0) {
        int base = n % 10;
        sum +=(int) Math.pow(base, power);
        n /= 10;
    }
    if (sum == original) {
        System.out.println(original + " is a Armstrong number.");
    } else {
        System.out.println(original + " is not a Armstrong number.");
    }
    sc.close();
  }
} 
