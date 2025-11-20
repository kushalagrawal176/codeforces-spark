import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of stops
        int maxi = Integer.MIN_VALUE; // maximum passengers at any time
        int pass = 0;           // current passengers

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // passengers leaving
            int b = sc.nextInt(); // passengers entering

            maxi = Math.max(maxi, pass - a + b);
            pass = pass - a + b;
        }

        System.out.println(maxi);
    }
}
