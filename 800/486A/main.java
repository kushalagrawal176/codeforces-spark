import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long sum = 0;

        sum = sum + n / 2;

        if (n % 2 != 0) {
            sum = sum - n;
        }

        System.out.println(sum);
    }
}
