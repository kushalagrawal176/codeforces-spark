import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int cnt = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i].charAt(1) == arr[i + 1].charAt(0)) {
                cnt++;
            }
        }

        System.out.println(cnt + 1);
    }
}
