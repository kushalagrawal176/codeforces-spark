import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Check if first character is lowercase
        if (Character.isLowerCase(s.charAt(0))) {
            // Convert first character to uppercase and append the rest
            s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        }

        System.out.println(s);
    }
}