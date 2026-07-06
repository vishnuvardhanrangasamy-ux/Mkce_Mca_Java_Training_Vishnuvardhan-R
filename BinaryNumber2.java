public class BinaryNumber2 {
    public static void main(String[] args) {
        int number = 146;
        int temp = number;
        String binary = "";

        while (temp > 0) {
            binary = (temp % 2) + binary;
            temp = temp / 2;
        }

        System.out.println("Decimal Number: " + number);
        System.out.println("Binary Number: " + binary);
    }
}