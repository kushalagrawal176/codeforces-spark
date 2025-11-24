import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = sc.nextInt();
        int maxi = a;
        int mini = a;

        n--; // one element already read
        int cnt = 0;

        while (n-- > 0) {
            int b = sc.nextInt();

            if (maxi < b) {
                cnt++;
                maxi = b;
            }
            if (mini > b) {
                cnt++;
                mini = b;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}
