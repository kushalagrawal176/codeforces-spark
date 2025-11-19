import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();  // Limak's weight
        int b = sc.nextInt();  // Bob's weight

        int cnt = 0;

        while (a <= b) {
            a = a * 3;   // Limak triples
            b = b * 2;   // Bob doubles
            cnt++;
        }

        System.out.println(cnt);  // Print number of years
    }
}