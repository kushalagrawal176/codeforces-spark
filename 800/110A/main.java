import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int cnt = 0;

        while (n != 0) {
            long digit = n % 10;
            if (digit == 4 || digit == 7) {
                cnt++;
            }
            n /= 10;
        }

        if (cnt == 4 || cnt == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
