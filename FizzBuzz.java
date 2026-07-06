public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println(i + " - FIZZ");
            } else if (i % 5 == 0) {
                System.out.println(i + " - BUZZ");
            } else {
                System.out.println(i);
            }
        }
    }
}