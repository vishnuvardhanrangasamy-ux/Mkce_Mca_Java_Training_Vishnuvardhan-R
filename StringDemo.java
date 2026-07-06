public class StringDemo {
    public static void main(String[] args) {

        String a = "Java Programming";

        System.out.println("String: " + a);
        System.out.println("Length: " + a.length());
        System.out.println("Uppercase: " + a.toUpperCase());
        System.out.println("Lowercase: " + a.toLowerCase());
        System.out.println("First Character: " + a.charAt(0));
        System.out.println("Substring: " + a.substring(5));
        System.out.println("Contains 'Java': " + a.contains("Java"));
    }
}
