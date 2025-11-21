import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            sum += a;
        }

        // Cast to double to ensure floating-point division
        double average = sum / (n * 1.0);

        System.out.println(average);
    }
}
