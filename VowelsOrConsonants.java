import java.util.Scanner;
public class VowelsOrConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
            ch == 'A' || ch == 'E' || ch == 'O' || ch == 'O' || ch == 'U') {
                System.out.println("Vowels");
            } else {
                System.out.println("Consonant");
            }
            sc.close();
        }
    }


